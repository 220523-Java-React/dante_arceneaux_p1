package com.revature.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.repository.UserRepository;

public class AuthService {

    private static final String SECRET = "secret";
    private static final Algorithm ALGORITHM = Algorithm.HMAC256("secret");
    private static final String ISSUER = "auth0";
    private static final JWTVerifier JWT_VERIFIER = JWT.require(ALGORITHM).withIssuer(ISSUER).build();

    private static final UserRepository userRepository = new UserRepository();

    public static String authenticateUser(User user) {
        User dbUser = userRepository.getByUsername(user.getUsername());
        if (dbUser != null) {
            if (user.getPassword().equals(dbUser.getPassword())) {
                return generateToken(dbUser);
            }

        }
        return null;
    }

    public static Boolean isValidToken(String token) {
        try {
            DecodedJWT jwt = JWT_VERIFIER.verify(token);

            Claim claim = jwt.getClaim("role");
            Role role = Role.valueOf(claim.as(String.class));

            System.out.println(role);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static String generateToken(User user) {
        String token = null;

        try {
            token = JWT.create()
                    .withIssuer(ISSUER)
                    .withClaim("username", user.getRole().toString())
                    .sign(ALGORITHM);
        } catch (JWTCreationException e) {
            e.printStackTrace();
        }

        return token;

    }
}