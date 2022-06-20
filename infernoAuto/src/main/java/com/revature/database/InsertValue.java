package com.revature.database;
import java.sql.*;

public class InsertValue  {
    public void createItem(int id, String firstName,
                           String lastName , String username, String password, String role) throws SQLException {

        Statement statement = null;
        Connection connection = Database.getConnection();

        try {
            String query = "INSERT INTO users (first_name, last_name, username, password, role) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, role);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void createOffer(String offer_type, int offer_price, String offer_status) {
        // we are receiving a full user object
        // we need a query to insert that record
        //                                                                                1,2,3,4
        String sql = "insert into offerdata(offer_type, offer_price, offer_status) values(?,?,?)";

        try {

            Connection connection = Database.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, offer_type);
            stmt.setInt(2, offer_price);
            stmt.setString(3, offer_status);

            int success = stmt.executeUpdate();

    }
    catch (SQLException e) {
        e.printStackTrace();
    }
    }

    public void createCar(String make, String model, int year, int price) {
        // we are receiving a full user object
        // we need a query to insert that record
        //                                                                                1,2,3,4
        String sql = "insert into cars(make, model, year, price) values(?,?,?,?)";

        try {

            Connection connection = Database.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, make);
            stmt.setString(2, model);
            stmt.setInt(3, year);
            stmt.setInt(4, price);

            int success = stmt.executeUpdate();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

