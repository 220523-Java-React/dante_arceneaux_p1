package com.revature.database;
import java.sql.*;

public class InsertValue  {
    public void createItem(int id, String firstName,
                           String lastName , String username, String password) throws SQLException {

        Statement statement = null;
        Connection connection = Database.getConnection();

        try {
            String query = "INSERT INTO users (first_name, last_name, username, password) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

