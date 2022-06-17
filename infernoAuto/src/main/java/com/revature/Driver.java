package com.revature;

import com.revature.controller.InfernoAutoController;
import com.revature.controller.OfferController;
import com.revature.controller.UserController;
import com.revature.database.Database;
import com.revature.database.InsertValue;
import com.revature.database.ReadValue;
import io.javalin.Javalin;
import org.apache.logging.log4j.core.util.ArrayUtils;

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

        app.get("/", context -> context.result("Welcome to the InfernoAutoAPI"));

        app.post("/user", userController.createUser);
        app.get("/user/all", userController.getAllUsers);
        app.get("/cars/all",
                infernoAutoController.getAllCars);
        app.get("/cars/{id}", infernoAutoController.getCarById);
        app.post("/cars", infernoAutoController.createCar);
        app.delete("/cars/{id}", infernoAutoController.deleteCarById);
        app.put("/cars", infernoAutoController.updateCar);
        app.post("/offers",
                offerController.createOffer);
        app.get("/offers/all",
                offerController.getAllOffers);
        app.get("/offers/{id}",
                offerController.getOfferById);
        app.delete("/offers/{id}",
                offerController.deleteOfferById);
        app.put("/offers", offerController.updateOffer);
        app.post("/offers/{id}/accept",
                offerController.acceptOffer);



        Scanner sc = new Scanner(System.in);
        System.out.println(
                "====================================");

        System.out.println("   Welcome to the Inferno " +
                "Auto!");
        System.out.println(
                "====================================");
        System.out.println("Type: 'sign up' or 'login' to" +
                " " +
                "continue. Type: 'guest' if you choose to " +
                "enter as a guest.");
        String choice = sc.nextLine();

        if(choice.equals("sign up")) {
            ReadValue readValue = new ReadValue();


            System.out.println("Please enter your first name");
            String firstName = sc.next();
            System.out.println("Please enter your last name");
            String lastName = sc.next();
            System.out.println("Please enter your username");
            String username = sc.next();
            System.out.println("Please enter your password");
            String password = sc.next();


            int id = 1;
            List<ArrayList> ids = Collections.singletonList(readValue.getAllIds());


            for (ArrayList i : ids) {
                while (i.contains(id)) {
                    id++;
                }
            }

            InsertValue insertValue = new InsertValue();

            insertValue.createItem(id, firstName, lastName, username, password);

            System.out.println("You have successfully signed up!");
            System.out.println("Welcome " + firstName +" " + lastName + " your username is " + username );

        } else if(choice.equals("login")) {
        }

Connection con = Database.getConnection();
        if(con != null) {
            System.out.println("Connected to the database");
        } else {
            System.out.println("Failed to make connection");
        }
        }
    }

