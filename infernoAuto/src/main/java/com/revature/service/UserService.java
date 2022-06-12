package com.revature.service;
import java.util.*;
import com.revature.model.User;


public class UserService {

    private List<User> users; //list of users
    public UserService(){
        users = new ArrayList<>(); //create a new list of users

    }

    public boolean createUser(User user){
        return users.add(user); //add the user to the list
    }

    public UserService(List<User> users){
        this.users = users;
    }

    public List<User> getAllUsers(){
        return users;
    } //




}
