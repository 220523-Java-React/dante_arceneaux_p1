package com.revature.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection getConnection() throws SQLException {

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432" +
                            "/postgres", "postgres",
                    "Ch3ss75!9");

            return connection;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
