package com.revature.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthService {

    private static final String SECRET = "secret";
    private static final String ISSUER = "auth0";
    private static final Algorithm ALGORITHM = Algorithm.HMAC256("secret");

    private static final JWTVerifier JWT_VERIFIER = JWT.require(ALGORITHM).withIssuer(ISSUER).build();

    private static final UserRepository userRepository = new UserRepository();

    private static final Logger logger = LoggerFactory.getLogger(AuthService.class);

    public static String authenticateUser(User user) {
        User dbUser = userRepository.getByUsername(user.getUsername());
        if (dbUser != null) {
            if (user.getPassword().equals(dbUser.getPassword())) {
                return generateToken(dbUser);
            }

        }
        return null;
    }

    public static void isValidToken(String token) throws JWTVerificationException {

        DecodedJWT jwt = JWT_VERIFIER.verify(token);

        Claim claim = jwt.getClaim("username");
        String username = claim.asString();
        User user = userRepository.getByUsername(username);
        if (user == null) {
            throw new JWTVerificationException("User not found");
        }
        System.out.println(user.getUsername());
    }


    private static String generateToken(User user) {
        String token = null;
          try {
                token = JWT.create()
                        .withIssuer(ISSUER)
                        .withClaim("username", user.getUsername())
                        .sign(ALGORITHM);
            } catch (JWTCreationException exception) {
                logger.error("Error creating JWT", exception);
                return null;
            }
          return token;
        }
    }
