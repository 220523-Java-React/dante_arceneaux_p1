package com.revature.database;
import java.sql.*;

public class InsertValue {
    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432" +
                        "/postgres", "postgres",
                "Ch3ss75!9");

        try{

            String query = "INSERT INTO userdata " +
                    "(id, username, password) values " +
                    "(1, 'dante', 'rex')";

            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Values inserted successfully");
        }   catch (Exception e) {
            e.printStackTrace();
        }

    }

}
