package com.revature.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnection {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432" +
                            "/postgres", "postgres",
                    "Ch3ss75!9");
            System.out.println("Connected to PostgreSQL database!");
        } catch (Exception e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }





    }
}
