package com.revature;

import com.revature.controller.AuthController;
import com.revature.controller.InfernoAutoController;
import com.revature.controller.OfferController;
import com.revature.controller.UserController;
import com.revature.database.Database;
import com.revature.database.InsertValue;
import com.revature.database.ReadValue;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.service.Login;
import com.revature.service.Selection;
import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.javalin.apibuilder.ApiBuilder.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Driver {

   static Logger logger = LoggerFactory.getLogger(Driver.class);

    public static void main(String[] args)  {



        InfernoAutoController infernoAutoController = new InfernoAutoController();
        UserController userController = new UserController();
        OfferController offerController = new OfferController();

        Javalin app = Javalin.create().start(8008);



        app.routes(() -> {
            path("users", () -> {
                get("/all", userController.getAllUsers);
                post(userController.createUser);
            });
            path("cars", () -> {
                get("/all",  infernoAutoController.getAllCars);
                post("/employee", infernoAutoController.createCar);
                delete("/employee/{id}", infernoAutoController.deleteCarById);
                put(infernoAutoController.updateCar);
            });
            path("offers", () -> {


            });
        });
        app.post("/offers", offerController.createOffer);
        app.get("/offers/all", offerController.getAllOffers);
        app.get("/offers/{id}", offerController.getOfferById);
        app.put("/offers/update/", offerController.updateByOffer);
        app.delete("/offers/delete/{id}", offerController.deleteOfferById);



        app.get("/users/{id}", userController.getUserById);
        app.get("/cars/{id}", infernoAutoController.getCarById);

        app.post("/authenticate", AuthController.authenticate);

        app.post("/register", userController.createUser);

        app.before("/users*", AuthController.withAuth);
        app.before("/cars*", AuthController.withAuth);

       Login login = new Login();
        Selection selection = new Selection();
         login.login();
        selection.startProgram();



    }
    }

