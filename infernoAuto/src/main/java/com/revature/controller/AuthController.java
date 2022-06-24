package com.revature.controller;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.service.AuthService;
import io.javalin.http.ForbiddenResponse;
import io.javalin.http.Handler;

public class AuthController {

    public static Handler authenticate = context -> {
        User user = context.bodyAsClass(User.class);
        String token = AuthService.authenticateUser(user);

        if(token != null) {
            context.status(200).result("Bearer " + token);
        } else {
            context.status(401).result("Bad credentials");
        }
    };


    public static Handler withAuth = context -> {
        UserRepository userRepository = new UserRepository();

        if(userRepository.getUserByRole(Role.EMPLOYEE) == null) {
            throw new ForbiddenResponse("You must add a valid Bearer token");
        }
        else {
            String token = context.header("Authorization").replace("Bearer ", "");
            try {
                AuthService.isValidToken(token);
            } catch (JWTVerificationException e) {
                throw new ForbiddenResponse("You must add a valid Bearer token");
            }
        }
    };

    public static Handler test = context -> {
        System.out.println("Did this work???");
    };

}
