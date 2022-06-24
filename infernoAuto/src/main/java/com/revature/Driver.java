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
                get("/get/all", userController.getAllUsers);
                get("/get/username/{username}", userController.getByUsername);
                post("/add", userController.createUser);
                get("/get/{id}", userController.getUserById);
                delete("/delete/{id}", userController.deleteUserById);
                put("update/{id}", userController.updateUserById);
                get("/get/role/{role}", userController.getUserByRole);

            });
            path("cars", () -> {
                get("/get/all",  infernoAutoController.getAllCars);
                get("/get/{id}", infernoAutoController.getCarById);
                get("/get/make/{make}", infernoAutoController.getCarsByMake);
                post("/add", infernoAutoController.createCar);
                delete("/delete/{id}", infernoAutoController.deleteCarById);
                put("/update/{id}", infernoAutoController.updateCarById);
            });
            path("offers", () -> {
                post("/add", offerController.createOffer);
                get("/get/all", offerController.getAllOffers);
                get("/get/{id}", offerController.getOfferById);
                put("/update/{id}", offerController.updateByOfferId);
                delete("/delete/{id}", offerController.deleteOfferById);
                post("/accept/{id}", offerController.acceptOffer);

            });
        });



        app.post("/authenticate", AuthController.authenticate);

        app.post("/register", userController.createUser);

        app.before("/users*", AuthController.withAuth);
        app.before("/offers/accept/{id}*", AuthController.withAuth);
        app.before("/cars/delete/{id}*", AuthController.withAuth);

//       Login login = new Login();
//        Selection selection = new Selection();
//         login.login();
//        selection.startProgram();

        }
    }

