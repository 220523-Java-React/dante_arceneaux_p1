package com.revature.controller;

import com.revature.Driver;
import com.revature.model.Offer;
import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.service.UserService;
import io.javalin.http.Handler;
import java.util.*;


public class UserController extends Driver {


     UserService userService = new UserService();
    public Handler getAllUsers = ctx -> {
        ctx.json(userService.getAllUsers());
        ctx.status(201);
    };


    public Handler createUser = ctx -> {
        User user = ctx.bodyAsClass(User.class);
        userService.createUser(user);
        ctx.status(201); // set the status code to 201
    };


}
