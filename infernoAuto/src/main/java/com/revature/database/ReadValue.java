package com.revature.database;
import java.sql.*;
import java.util.ArrayList;


public class ReadValue  {
    public static void readValue() throws SQLException {
        Statement statement = null;
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432" +
                        "/postgres", "postgres",
                "Ch3ss75!9");
   try

        {
            String query = "SELECT * FROM userdata";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("firstname"));
                System.out.println(resultSet.getString("lastname"));
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
            }
        } catch (SQLException e)
        {
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
            String query = "SELECT * FROM userdata WHERE id = ?";
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
            String query = "SELECT id FROM userdata";
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
}
