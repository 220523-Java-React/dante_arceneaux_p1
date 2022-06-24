package com.revature.repository;

import com.revature.model.Offer;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserRepository implements Dao<User> {


    @Override
    public Object createObject(User user) {
        return null;
    }

    @Override


    public User create(User user) {
        // we are receiving a full user object
        // we need a query to insert that record
        //                                                                                1,2,3,4
        String sql = "insert into users(first_name, last_name, username, password, role_id) values(?,?,?,?,?)";


        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getUsername());
            stmt.setString(4, user.getPassword());
            stmt.setInt(5, user.getRole().ordinal());


            int success = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<User> getAll() {
        // Empty lists of users, will add any new users from the result set
        List<User> users = new ArrayList<>();


        String sql = "select * from users";
        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while (results.next()) {
                // go through each result, build a User object for that data, add that user object the users list
                User user = new User();

                user.setId(results.getInt("id"));
                user.setFirstName(results.getString("first_name"));
                user.setLastName(results.getString("last_name"));
                user.setUsername(results.getString("username"));
                user.setPassword(results.getString("password"));


                users.add(user);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }


    @Override
    public User getById(int id) {

        String sql = "select * from users where id = ?";
        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // build return the user and return it
                return new User()
                        .setId(rs.getInt("id"))
                        .setFirstName(rs.getString("first_name"))
                        .setLastName(rs.getString("last_name"))
                        .setUsername(rs.getString("username"))
                        .setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }


    @Override
    public boolean deleteById(int id) {
        return false;
    }

    public Object createUser(Object o) {

        return null;
    }

    public User getUserByUsername(String username) {
        String sql = "select * from users where username = ?";
        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);

            ResultSet results = stmt.executeQuery();

            if (results.next()) {
                // go through each result, build a User object for that data, add that user object the users list
                User user = new User();

                user.setId(results.getInt("id"));
                user.setFirstName(results.getString("first_name"));
                user.setLastName(results.getString("last_name"));
                user.setUsername(results.getString("username"));
                user.setPassword(results.getString("password"));

                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public User getUserByRole(Role role) {
        String sql = "select * from users where role_id = ?";
        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, role.ordinal());

            ResultSet results = stmt.executeQuery();

            if (results.next()) {
                // go through each result, build a User object for that data, add that user object the users list
                User user = new User();

                user.setId(results.getInt("id"));
                user.setFirstName(results.getString("first_name"));
                user.setLastName(results.getString("last_name"));
                user.setUsername(results.getString("username"));
                user.setPassword(results.getString("password"));

                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User getByUsername(String username) {

        String sql = "select * from users where username = ?";

        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);

            ResultSet results = stmt.executeQuery();

            if (results.next()) {
                // go through each result, build a User object for that data, add that user object the users list
                User user = new User();

                user.setId(results.getInt("id"));
                user.setFirstName(results.getString("first_name"));
                user.setLastName(results.getString("last_name"));
                user.setUsername(results.getString("username"));
                user.setPassword(results.getString("password"));

                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();



        }
        return null;

    }
    public User updateUserById(int id, User user) {

        String sql = "update users set first_name = ?, last_name = ?, username = ?, password = ?, role_id = ? where id = ?";
        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getUsername());
            stmt.setString(4, user.getPassword());
            stmt.setString(5, String.valueOf(user.getRole()));
            stmt.setInt(6, id);



            int success = stmt.executeUpdate();
            if (success == 1) {
                return user;
            }

        } catch (SQLException e) {
            //must be an employee
            e.printStackTrace();
            System.out.println("You are not an employee");
        }
        return null;
    };

    public User deleteUserById(int id) {
        String sql = "delete from users where id = ?";
        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            int success = stmt.executeUpdate();
            System.out.println("User deleted");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to delete user");
        }
        return null;
    }


}