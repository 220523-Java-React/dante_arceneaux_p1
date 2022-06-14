package com.revature.service;

import com.revature.model.User;
import com.revature.repository.UserDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplementation implements UserDao {

    private List<User> users;
    public UserDaoImplementation(){
        users = new ArrayList<>(); //create a new list of users

    }

    public boolean createUser(User user){
        return users.add(user); //add the user to the list
    }

    @Override
    public List<User> getAll() throws SQLException {
        return users;
    }

    @Override
    public int save(User user) throws SQLException {
        return 0;
    }

    @Override
    public int insert(User user) throws SQLException {
        return 0;
    }

    @Override
    public int update(User user) throws SQLException {
        return 0;
    }

    @Override
    public int delete(User user) throws SQLException {
        return 0;
    }

    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }

    @Override
    public int update(int id, User user) throws SQLException {
        return 0;
    }

    @Override
    public User get(int id) throws SQLException {
        return null;
    }
}

