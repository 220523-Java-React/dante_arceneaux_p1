package com.revature.database;
import java.sql.*;

public class InsertValue  {
    public static void createItem(int id, String firstName,
                           String lastName , String username, String password) throws SQLException {

        Statement statement = null;
        Connection connection = Database.getConnection();

        try {
            String query = "INSERT INTO userdata (id, firstname, lastname, username, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, username);
            preparedStatement.setString(5, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

