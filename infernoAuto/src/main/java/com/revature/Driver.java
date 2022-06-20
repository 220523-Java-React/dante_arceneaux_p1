package com.revature;

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

import static io.javalin.apibuilder.ApiBuilder.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) throws SQLException {
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
                delete(infernoAutoController.deleteCarById);
                put(infernoAutoController.updateCar);
            });
            path("offers", () -> {
                post( offerController.createOffer);
                get("/offers/all", offerController.getAllOffers);
            });
        });

       Login login = new Login();
        Selection selection = new Selection();
         login.login();
        selection.startProgram();



    }
    }

