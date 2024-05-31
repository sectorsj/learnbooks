package ru.sectorsj._315_query;

import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.util.*;

/**
 Демонстрация ряда сложных запросов в базу данных
 @author Сау Horstmann

 */
public class QueryTest {
    private static final String allQuery = "SELECT BOOKS.Price, BOOKS.Title FROM BOOKS";
    private static final String authorPublisherQuery =
            "SELECT BOOKS.PRICE, BOOKS.TITLE " +
            "FROM BOOKS, BOOKSAUTHORS, AUTHORS, PUBLISHERS " +
            "WHERE AUTHORS.AUTHOR_ID = BOOKSAUTHORS.AUTHOR_ID " +
            "AND BOOKSAUTHORS.ISBN = BOOKS.ISBN " +
            "AND BOOKS.PUBLISHER_ID = PUBLISHERS.PUBLISHER_ID " +
            "AND AUTHORS.NAME = ? " +
            "AND PUBLISHERS.NAME = ?";
    private static final String authorQuery =
            "SELECT BOOKS.PRICE, BOOKS.TITLE " +
            "FROM BOOKS, BOOKSAUTHORS, AUTHORS " +
            "WHERE AUTHORS.AUTHOR_ID = BOOKSAUTHORS.AUTHOR_ID " +
            "AND BOOKSAUTHORS.ISBN = BOOKS.ISBN " +
            "AND AUTHORS.NAME = ?";

    private static final String publisherQuery =
            "SELECT BOOKS.PRICE, BOOKS.TITLE " +
            "FROM BOOKS, PUBLISHERS " +
            "WHERE BOOKS.PUBLISHER_ID = PUBLISHERS.PUBLISHER_ID " +
            "AND Publishers.NAME = ?";

    private static final String priceUpdate =
            "UPDATE BOOKS " +
            "SET PRICE = PRICE + ? " +
            "WHERE BOOKS.PUBLISHER_ID = " +
                    "(SELECT PUBLISHERS.PUBLISHER_ID FROM Publishers WHERE Name = ?)";

    private static Scanner in;
    private static ArrayList<String> authors = new ArrayList<>();
    private static ArrayList<String> publishers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (Connection conn = getConnection()) {
            in = new Scanner(System.in);
            authors.add("Any");
            publishers.add("Any");
            try (Statement stat = conn.createStatement()) {

                // Заполняем списочный массив именами авторов книг
                var query = "SELECT NAME FROM AUTHORS";
                try (ResultSet rs = stat.executeQuery(query)) {
                    while (rs.next()){
                        authors.add(rs.getString(1));
                    }
                }
                // Заполняем списочный массив именами названиями издательств
                query = "SELECT NAME FROM PUBLISHERS";
                try (ResultSet rs = stat.executeQuery(query)) {
                    while (rs.next()) {
                        publishers.add(rs.getString(1));
                    }
                }
            }
            var done = false;
            while (!done) {
                System.out.print("Q)uery C)hange prices E)xit: ");
                String input = in.next().toUpperCase();
                if (input.equals("Q")){
                    executeQuery(conn);
                } else if (input.equals("C")) {
                    changePrices(conn);
                } else {
                    done = true;
                }
            }
        } catch (SQLException e) {
            for (Throwable t : e) {
                System.out.println(t.getMessage());
            }
        }
    }

    /**
     Выполняет выбранный запрос
     * @param conn Подключение к базе данных
     */
    private static void executeQuery(Connection conn) throws SQLException {
        String author = select("AUTHORS:", authors);
        String publisher = select("PUBLISHERS:", publishers);
        PreparedStatement stat;

        if (!author.equals("Any") && !publisher.equals("Any")) {
            stat = conn.prepareStatement(authorPublisherQuery);
            stat.setString(1, author);
            stat.setString(2, publisher);

        } else if (!author.equals("Any") && publisher.equals("Any")) {
            stat = conn.prepareStatement(authorQuery);
            stat.setString(1, author);

        } else if (author.equals("Any") && !publisher.equals("Any")) {
            stat = conn.prepareStatement(publisherQuery);
            stat.setString(1, publisher);

        } else {
            stat = conn.prepareStatement(allQuery);
        }

        try (ResultSet rs = stat.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString(1) + ", " + rs.getString(2));
            }
        }
    }

    /**
     Выполняет команду обновления с целью изменить цены на книги
     * @param conn Подключение к базе данных
     */
    private static void changePrices(Connection conn) throws SQLException {
        String publisher = select("Publishers:", publishers.subList(1, publishers.size()));
        System.out.print("Изменить цену на: ");
        double priceChange = in.nextDouble();
        PreparedStatement stat = conn.prepareStatement(priceUpdate);
        stat.setDouble(1, priceChange);
        stat.setString(2, publisher);
        int r = stat.executeUpdate();
        System.out.println(r + " записи обновлены");
    }

    /**
     Предлагаем пользователю выбрать символьную строку
     * @param prompt Отображаемое приглашение
     * @param options Варианты выбора, предлагаемые пользователю
     * @return Выбранный пользователем вариант
     */
    private static String select(String prompt, List<String> options) {
        while (true) {
            System.out.println(prompt);
            for (int i = 0; i < options.size(); i++) {
                System.out.printf("%2d) %s%n", i + 1, options.get(i));
            }
            int sel = in.nextInt();
            if (sel > 0 && sel <= options.size()) {
                return options.get(sel - 1);
            }
        }
    }

    /**
     Получаем сведения о подключении к базе данных из свойств,
     задаваемых в файле database.properties и на их основании подключаемся к базе данных
     * @return Подключение к базе данных
     * @throws SQLException исключение
     * @throws IOException исключение
     */
    private static Connection getConnection() throws SQLException, IOException {
        var props = new Properties();
        try (InputStream in = Files.newInputStream(
                Paths.get("hortsmann_v_two/src/main/resources/_301/database.properties"))) {
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
}