package com.revature.repository;

import com.revature.model.User;

import java.sql.SQLException;

public interface UserDao extends Dao<User> {

    User get(int id) throws SQLException;
}
