package ru.sectorsj._300_testdb;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.nio.file.*;

/**
 В этой программе проверяется правильность
 конфигурирования базы данных и драйвера JDBC
 */
public class TestDB {
    public static void main(String[] args) throws IOException {
        try {
            runTest();
        } catch (SQLException ex) {
            for (Throwable t : ex) {
                t.printStackTrace();
            }
        }
    }

    /**
     Выполняет тест, создавая таблицу, вводя в нее значение,
     отображая содержимое таблицы и удаляя ее
     */
    private static void runTest() throws SQLException, IOException {
        try (Connection conn = getConnection();
             Statement stat = conn.createStatement()) {
            stat.executeUpdate("CREATE TABLE Greetings (Message CHAR(20))");
            stat.executeUpdate("INSERT INTO Greetings VALUES ('Hello, World!'), ('Привет, Мир!'), ('Bonjour, Monde!')");

            try (ResultSet result = stat.executeQuery("SELECT * FROM Greetings")) {
                while (result.next()) {
                    System.out.println(result.getString(1));
                }
            }
            stat.executeUpdate("DROP TABLE Greetings");
        }
    }

    /**
     Получает сведения о подключении к базе данных из свойств,
     задаваемых в файле database.properties,
     и на их основании подключается к базе данных
     * @return Подключение к базе данных
     * @throws SQLException
     * @throws IOException
     */
    private static Connection getConnection() throws SQLException, IOException {
        var props = new Properties();

        try (InputStream in = Files.newInputStream(Paths.get("hortsmann_v_two/src/main/resources/_301/database.properties"))){
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