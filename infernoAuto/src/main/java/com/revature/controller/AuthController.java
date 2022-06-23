package com.revature.controller;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.revature.model.User;
import com.revature.service.AuthService;
import io.javalin.http.ForbiddenResponse;
import io.javalin.http.Handler;

public class AuthController {

    public static Handler authenticate = context -> {
        User user = context.bodyAsClass(User.class);
        AuthService.authenticateUser(user);

        String token = AuthService.authenticateUser(user);
        if(token != null) {
            context.status(200);
        } else {
            context.status(401).result("Bad credentials");
        }
    };


    public static Handler withAuth = context -> {
        try {
            String token = context.header("Authorization").replace("Bearer ", "");
            AuthService.isValidToken(token);

        } catch (NullPointerException | JWTVerificationException e) {
           throw new ForbiddenResponse("You must add a valid token to your request");
        }
    };

}
