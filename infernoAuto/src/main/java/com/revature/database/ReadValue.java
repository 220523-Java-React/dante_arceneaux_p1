package com.revature.database;
import com.revature.model.User;

import java.sql.*;
import java.util.ArrayList;


public class ReadValue {
    public static void readValue() throws SQLException {
        Statement statement = null;
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432" +
                        "/postgres", "postgres",
                "Ch3ss75!9");
        try {
            String query = "SELECT * FROM users";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("firstname"));
                System.out.println(resultSet.getString("lastname"));
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readValue(int id) throws SQLException {
        Statement statement = null;
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432" +
                        "/postgres", "postgres",
                "Ch3ss75!9");
        try {
            String query = "SELECT * FROM users WHERE " +
                    "id " +
                    "= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("firstname"));
                System.out.println(resultSet.getString("lastname"));
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> getAllIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        try {
            Statement statement = null;
            Connection connection = Database.getConnection();
            String query = "SELECT id FROM users";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ids.add(resultSet.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ids;
    }

    public ArrayList<String> getAllPasswords() {
        ArrayList<String> passwords = new ArrayList<>();
        try {
            Statement statement = null;
            Connection connection = Database.getConnection();
            String query = "SELECT password FROM users";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                passwords.add(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passwords;
    }

    public ArrayList<String> getAllUsernames() {
        ArrayList<String> usernames = new ArrayList<>();
        try {
            Statement statement = null;
            Connection connection = Database.getConnection();
            String query = "SELECT username FROM users";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                usernames.add(resultSet.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usernames;
    }

    public ArrayList<String> getAllCars() throws SQLException {
        Statement statement = null;
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432" +
                        "/postgres", "postgres",
                "Ch3ss75!9");
        try {
            String query = "SELECT id, make, model, year,  price  FROM cars";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("make"));
                System.out.println(resultSet.getString("model"));
                System.out.println(resultSet.getInt("year"));
                System.out.println(resultSet.getInt("price"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}