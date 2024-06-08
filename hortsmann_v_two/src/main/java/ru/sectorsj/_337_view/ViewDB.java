package ru.sectorsj._337_view;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.List;

/**
 Демонстрация применение метаданных для отображения произвольно выбираемых таблиц в базе данных
 * @version 1.34 2018-05-01
 * @author Сау Hortsmann
 */
public class ViewDB {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new ViewDBFrame();
            frame.setTitle("ViewDB");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class ViewDBFrame extends JFrame {
    private JButton previousButton;
    private JButton nextButton;
    private JButton deleteButton;
    private JButton saveButton;
    private DataPanel dataPanel;
    private Component scrollPane;
    private JComboBox<String> tableNames;
    private Properties props;
    private CachedRowSet crs;
    private Connection conn;

    public ViewDBFrame() {
        tableNames = new JComboBox<String>();

        try {
            readDatabaseProperties();
            conn = getConnection();
            DatabaseMetaData meta = conn.getMetaData();
            try (ResultSet mrs = meta.getTables(
                    null,
                    null,
                    null,
                    new String[] {"TABLE"})) {
                while (mrs.next()) {
                    tableNames.addItem(mrs.getString(3));
                }
            }
        } catch (SQLException ex) {
            for (Throwable t : ex) {
                t.printStackTrace();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        tableNames.addActionListener(
                event -> showTable((String) tableNames.getSelectedItem(), conn));
        add(tableNames, BorderLayout.NORTH);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    for (Throwable t : ex) {
                        t.printStackTrace();
                    }
                }
            }
        });
        var buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.SOUTH);

        previousButton = new JButton("Предыдущая");
        previousButton.addActionListener(event -> showPreviousRow());
        buttonPanel.add(previousButton);

        nextButton = new JButton("Следующая");
        nextButton.addActionListener(event -> showNextRow());
        buttonPanel.add(nextButton);

        deleteButton = new JButton("Удалить");
        deleteButton.addActionListener(event -> deleteRow());
        buttonPanel.add(deleteButton);

        saveButton = new JButton("Сохранить");
        saveButton.addActionListener(event -> saveChanges());
        buttonPanel.add(saveButton);

        if (tableNames.getItemCount() > 0) {
            showTable(tableNames.getItemAt(0), conn);
        }
    }

    /** - check.
     Подготавливает текстовые поля для отображения новой таблицы и отображает первую строку.
     * @param tableName имя таблицы для отображения
     * @param conn Соединение с базой данных
     */
    private void showTable(String tableName, Connection conn) {
        try (Statement stat = conn.createStatement();
             ResultSet result = stat.executeQuery("SELECT * FROM " + tableName)) {

            RowSetFactory factory = RowSetProvider.newFactory();
            crs = factory.createCachedRowSet();
            crs.setTableName(tableName);
            crs.populate(result);

            if (scrollPane != null) {
                remove(scrollPane);
            }
            dataPanel = new DataPanel(crs);
            scrollPane = new JScrollPane(dataPanel);
            add(scrollPane, BorderLayout.CENTER);
            pack();
            showNextRow();
        } catch (SQLException ex) {
            for (Throwable t : ex) {
                t.printStackTrace();
            }
        }
    }


    /** - check.
     Переходим к предыдущей строке таблицы.
     */
    public void showPreviousRow() {
        try {
            if (crs == null || crs.isFirst()) {
                return;
            }
            crs.previous();
            dataPanel.showRow(crs);
        } catch (SQLException ex) {
            for (Throwable t : ex) {
                t.printStackTrace();
            }
        }
    }


    /** - check.
     Переходим к следующей строке таблицы.
     */
    public void showNextRow() {
        try {
            if (crs == null || crs.isLast()) {
                return;
            }
            crs.next();
            dataPanel.showRow(crs);
        } catch (SQLException ex) {
            for (Throwable t : ex) {
                t.printStackTrace();
            }
        }
    }

    /** - check.
     Удаляем текущую строку таблицы.
     */
    public void deleteRow(){
        if (crs == null) {
            return;
        }
        new SwingWorker<Void, Void>() {
            public Void doInBackground() throws SQLException {
                crs.deleteRow();
                crs.acceptChanges(conn);
                if (crs.isAfterLast()) {
                    if (!crs.last()) {
                        crs = null;
                    }
                }
                return null;
            }
            public void done() {
                dataPanel.showRow(crs);
            }
        }.execute();
    }

    /** - check.
     Сохраняем все изменения
     */
    public void saveChanges() {
        if (crs == null) {
            return;
        }
        new SwingWorker<Void, Void>() {
            public Void doInBackground() throws SQLException {
                dataPanel.setRow(crs);
                crs.acceptChanges(conn);
                return null;
            }
        }.execute();
    }

    /** - check.
     Получает соединение из свойств, указанных в файле data.properties.
     * @return Соединение с базой данных
     * @throws SQLException
     */
    private Connection getConnection() throws SQLException {
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }


    /** - check

     * @throws IOException
     */
    private void readDatabaseProperties() throws IOException {
        props = new Properties();

        try (Reader in = Files.newBufferedReader(Path.of("hortsmann_v_two/src/main/resources/_301//database.properties"),
                StandardCharsets.UTF_8)) {
            props.load(in);
        }
        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) {
            System.setProperty("jdbc.drivers", drivers);
        }
    }
}

/** - check.
 На этой панели отображается содержимое Результирующего набора.
 */
class DataPanel extends JPanel {
    private List<JTextField> fields;

    /** - check.
     Создаем панель данных.
     * @param rs Результирующий набор, содержимое которого отображается на этой панели
     * @throws SQLException
     */
    public DataPanel(RowSet rs) throws SQLException {
        fields = new ArrayList<>();
        setLayout(new GridBagLayout());
        var gbc = new GridBagConstraints();
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            gbc.gridy = i - 1;

            String columnName = rsmd.getColumnLabel(i);
            gbc.gridx = 0;
            gbc.anchor = GridBagConstraints.EAST;
            add(new JLabel(columnName), gbc);

            int columnWidth = rsmd.getColumnDisplaySize(i);
            var tb = new JTextField(columnWidth);
            // if (!rsmd.getColumnClassName(i).equals("java.lang.String") { // нельзя редактировать цену книг
            if (!rsmd.getColumnClassName(i).equals("java.lang.String")
                    // условие позволяющее редактировать цену книг тоже
                    && !rsmd.getColumnLabel(i).equalsIgnoreCase("Price")) {
                    tb.setEditable(false);
            }
            fields.add(tb);
            gbc.gridx = 1;
            gbc.anchor = GridBagConstraints.WEST;
            add(tb, gbc);
        }
    }

    /** - check.
     Показывает строку базы данных, заполняя все текстовые поля значениями столбцов.
     * @param rs Результирующий набор
     */
    public void showRow(ResultSet rs) {
        try {
            for (int i = 1; i <= fields.size(); i++) {
                String field = rs == null ? "" : rs.getString(i);
                JTextField tb = fields.get(i - 1);
                tb.setText(field);
            }
        } catch (SQLException ex) {
            for (Throwable t : ex) {
                t.printStackTrace();
            }
        }
    }


    /** - check.
     Обновляет измененные данные в текущую строку набора строк.
     * @param rs Результирующий набор
     * @throws SQLException
     */
    public void setRow(RowSet rs) throws SQLException {
        for (int i = 1; i <= fields.size(); i++) {
            String field = rs.getString(i);
            JTextField tb = fields.get(i - 1);
            if (!field.equals(tb.getText())) {
                rs.updateString(i, tb.getText());
            }
        }
        rs.updateRow();
    }
}