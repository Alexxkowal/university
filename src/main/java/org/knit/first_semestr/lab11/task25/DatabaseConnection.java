package org.knit.first_semestr.lab11.task25;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "secret";

    private static Connection connection;

    private DatabaseConnection() {}

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }
}
