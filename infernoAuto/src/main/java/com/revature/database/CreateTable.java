package com.revature.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;


public class CreateTable {

    public static void main(String[] args) throws SQLException {

        Statement statement = null;
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres", "postgres", "Ch3ss75!9");
       try {
           String query = "CREATE TABLE users (id " +
                   "SERIAL PRIMARY KEY, first_name " +
                   "VARCHAR(255)" +
                   ", last_name VARCHAR(255), username" +
                   " " +
                   "VARCHAR(255), password VARCHAR(255))";
           statement = connection.createStatement();
           statement.executeUpdate(query);
           System.out.println("Table created successfully");
       }
         catch (Exception e) {
              e.printStackTrace();
         }

    }
}