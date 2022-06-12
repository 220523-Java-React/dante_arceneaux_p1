package com.revature.repository;

import com.revature.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImplementation implements UserDao {

    @Override
    public List<User> getAll() throws SQLException {
        return null;
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

