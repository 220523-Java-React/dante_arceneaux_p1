package com.revature.service;

import com.revature.model.Role;
import com.revature.model.User;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users;
    public UserService(){
        users = new ArrayList<>();

    }
    public UserService(List<User> users){
        this.users = users;
    }
    public boolean createUser(User user){
        return users.add(user);
    }

    public List<User> getAllUsers(){
        return users;
    }





}
