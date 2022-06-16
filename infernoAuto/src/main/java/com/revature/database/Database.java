package com.revature.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final static String url = "jdbc:postgresql" +
            "://localhost:5432/postgres";
    private final static String username = "postgres";
    private final static String password = "Ch3ss75!9";

    private Database() {
        // private constructor
    }
    public static Connection getConnection() throws SQLException {

        Connection connection = null;
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
