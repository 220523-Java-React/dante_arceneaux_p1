package com.revature.controller;

import com.revature.Driver;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.service.UserService;
import io.javalin.http.Handler;
import java.util.*;


public class UserController extends Driver {


     UserService userService = new UserService();
     UserRepository userDao = new UserRepository();
    public Handler getAllUsers = ctx -> {
        ctx.json(userService.getAllUsers());
        ctx.status(201);
    };


    public Handler createUser = ctx -> {
        User user = ctx.bodyAsClass(User.class);
        userService.createUser(user);
        ctx.status(201); // set the status code to 201
    };

    public Handler getUserById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id"));
        ctx.json(userService.getUserById(id));
        ctx.status(201);
    };

    public Handler getByUsername = ctx -> {
        String username = ctx.pathParam("username");
        ctx.json(userDao.getByUsername(username));
        ctx.status(201);
    };

    UserRepository userRepository = new UserRepository();
    public Handler deleteUserById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id"));
        userRepository.deleteUserById(id);
        ctx.status(204);
    };


    public Handler updateUser = ctx -> {
        User user = ctx.bodyAsClass(User.class);
        userRepository.update(user);
        ctx.status(201);
    };

    public Handler updateUserById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id"));
        User user = ctx.bodyAsClass(User.class);
        userRepository.updateUserById(id, user);
        ctx.status(201);
    };

    }
