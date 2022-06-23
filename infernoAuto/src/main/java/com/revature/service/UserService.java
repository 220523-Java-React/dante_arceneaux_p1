package com.revature.service;

import com.revature.model.Car;
import com.revature.model.Offer;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    UserRepository userRepository;
    List<User> users;

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

    public User getByUsername(String username){
        return (User) userRepository.getByUsername(username);
    }

    public boolean deleteUserById(int id){
        return userRepository.deleteById(id);
    }
    public Role getRole(Role role) {
        return role;
    }

   //update user


    public User updateUserById(int id, User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.set(i, user);
                return user;
            }
        }
        return null;
    }

    public boolean deleteUser(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(i);
                return true;
            }
        }
        return false;
    }

}
