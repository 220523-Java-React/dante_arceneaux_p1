package com.revature.service;

import com.revature.model.User;
import com.revature.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    UserRepository userRepository;

    public UserService(){
        userRepository = new UserRepository();
    }

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return (User) userRepository.create(user);
    }

    public List<User> getAllUsers(){
        return userRepository.getAll();
    }

    public User getUserById(int id){
        return (User) userRepository.getById(id);
    }

    public boolean deleteUserById(int id){
        return userRepository.deleteById(id);
    }
}
