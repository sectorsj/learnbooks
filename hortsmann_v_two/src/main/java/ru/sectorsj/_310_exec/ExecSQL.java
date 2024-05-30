package ru.sectorsj._310_exec;

import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.util.*;

public class ExecSQL {
    public static void main(String[] args) throws IOException {
        // Создание объекта Scanner для чтения ввода пользователя или из файла,
        // указанного в аргументах командной строки
        try (Connection conn = getConnection();
             Statement stat = conn.createStatement();
             Scanner in = new Scanner(System.in)) {
            if (args.length > 0) {
                // Загрузка скриптов из файлов, указанных в аргументах командной строки
                for (String filePath : args) {
                    try {
                        String connect = Files.readString(Path.of(filePath));
                        executeScript(stat, connect);
                    } catch (IOException e) {
                        System.out.println("Предупреждение: файл не найден или указан неверный путь – \" + filePath");
                    }
                }
            }
            while (true) {
                // Если нет аргументов командной строки, выводим приглашение для ввода команды
                if (args.length == 0) {
                    System.out.println("Введите нужную SQL команду,");
                    System.out.println("либо команду: 'LOAD FILES' для загрузки данных из файла,");
                    System.out.println("либо команду: 'EXIT' для выхода из программы:");
                }
                // Проверка наличия следующей строки ввода
                if (!in.hasNextLine()) {
                    return;
                }
                // Чтение следующей строки ввода и удаление начальных и конечных пробелов
                String line = in.nextLine().trim();

                // Если введена команда "EXIT", завершаем программу
                if (line.equalsIgnoreCase("EXIT")){
                    return;
                }

                // Если введена команда "LOAD FILES", запрашиваем пути к файлам
                // и выполняем скрипты из файлов
                if (line.equalsIgnoreCase("LOAD FILES")) {
                    System.out.println("Введите пути к файлам скриптов (через запятую и пробел):");
                    String filePaths = in.nextLine().trim();
                    String[] paths = filePaths.split(",");

                    // Обработка каждого файла скрипта
                    for (String path : paths) {
                        path = path.trim();
                        try {
                            // Чтение содержимого файла скрипта
                            String content = Files.readString(Path.of(path));
                            // Выполнение скрипта
                            executeScript(stat, content);
                        } catch (IOException e) {
                            // Обработка ошибки, если файл не найден или указан неверный путь
                            System.out.println("Предупреждение: файл не найден или указан неверный путь – " + path);
                        }
                    }
                } else {
                    // Если введена обычная SQL-команда, удаляем точку с запятой в конце,
                    // если присутствует
                    if (line.endsWith(";")){
                        line = line.substring(0, line.length() - 1);
                    }
                    // Выполнение SQL-команды
                    executeStatement(stat, line);
                }
            }
        } catch (SQLException e) {
            // Обработка исключений SQLException
            for (Throwable t : e) {
                t.printStackTrace();
            }
        }
    }

    /**

     * @return
     * @throws SQLException
     * @throws IOException
     */
    public static Connection getConnection() throws SQLException, IOException {
        var props = new Properties();

        try(InputStream in = Files.newInputStream(Paths.get("hortsmann_v_two/src/main/resources/_301/database.properties"))) {
            props.load(in);
        }
        String drivers = props.getProperty("jdbc.drivers");

        if (drivers != null) {
            System.setProperty("jdbc.drivers", drivers);
        }
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }

    /**
     Метод для выполнения скрипта из файла
     * @param stat
     * @param script
     * @throws SQLException
     */
    public static void executeScript (Statement stat, String script) throws SQLException {
        // Разделение скрипта на отдельные SQL-команды по точке с запятой
        String[] statements = script.split(";");

        // Обработка каждой SQL-команды
        for (String sql : statements) {
            sql = sql.trim();
            // Если команда не пустая
            if (!sql.isEmpty()) {
                // Если команда начинается с "INSERT INTO", выполняем специальную обработку
                if (sql.toUpperCase().startsWith("INSERT INTO")) {
                    executeInsertStatement(stat, sql);
                } else {
                    // Иначе выполняем обычную SQL-команду
                    executeStatement(stat, sql);
                }
            }
        }
    }

    /**
     Метод для выполнения команды "INSERT INTO" с несколькими значениями
     * @param stat
     * @param sql
     * @throws SQLException
     */
    public static void executeInsertStatement(Statement stat, String sql) throws SQLException {
        // Разделение команды на отдельные строки по символу новой строки
        String[] lines = sql.split("\\r?\\n");
        StringBuilder sb = new StringBuilder();

        // Обработка каждой строки
        for (String line : lines) {
            // Если строка не пустая
            if (!line.isEmpty()) {
                // Если строка заканчивается запятой, добавляем ее к текущей команде
                if (line.endsWith(",")) {
                    sb.append(line).append(" ");
                } else {
                    // Иначе добавляем строку к текущей команде и выполняем ее
                    sb.append(line);
                    executeStatement(stat, sb.toString());
                    sb.setLength(0);
                }
            }
        }
    }

    /**
     Метод для выполнения SQL-команды
     * @param stat
     * @param sql
     * @throws SQLException
     */
    public static void executeStatement(Statement stat, String sql) throws SQLException {
        try {
            // Выполнение SQL-команды и получение признака наличия результата
            boolean isResult = stat.execute(sql);

            // Если есть результат
            if (isResult) {
                // Получаем результат в виде объекта ResultSet и отображаем его
                try (ResultSet rs = stat.getResultSet()) {
                    showResultSet(rs);
                }
            } else {
                // Если нет результата, получаем количество обновленных строк и выводим его
                int updateCount = stat.getUpdateCount();
                System.out.println(updateCount + " строки обновлены");
            }
        } catch (SQLException e) {
            for (Throwable t : e) {
                // Обработка исключений SQLException
                t.printStackTrace();
            }
        }
    }

    /**
     Метод для отображения результата запроса
     * @param result
     * @throws SQLException
     */
    public static void showResultSet(ResultSet result) throws SQLException {
        // Получение метаданных результата
        ResultSetMetaData metaData = result.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Вывод заголовков столбцов
        for (int i = 1; i <= columnCount; i++) {
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(metaData.getColumnCount());
        }
        System.out.println();

        // Вывод значений столбцов для каждой строки результата
        while (result.next()) {
            for (int i = 1; i <= columnCount ; i++) {
                if (i > 1) {
                    System.out.print(", ");
                }
                System.out.print(result.getString(i));
            }
            System.out.println();
        }
    }
}