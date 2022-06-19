package com.revature;

import com.revature.controller.InfernoAutoController;
import com.revature.controller.OfferController;
import com.revature.controller.UserController;
import com.revature.database.Database;
import com.revature.database.InsertValue;
import com.revature.database.ReadValue;
import com.revature.model.Employee;
import com.revature.model.Role;
import io.javalin.Javalin;
import org.apache.logging.log4j.core.util.ArrayUtils;
import io.javalin.core.security.RouteRole;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import static io.javalin.apibuilder.ApiBuilder.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import io.javalin.core.security.*;


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
                post(infernoAutoController.createCar);
                delete(infernoAutoController.deleteCarById);
                put(infernoAutoController.updateCar);
            });
            path("offers", () -> {
                post( offerController.createOffer);
                get("/offers/all", offerController.getAllOffers);
            });
        });




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

        if (choice.equals("sign up")) {
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
            System.out.println("Welcome " + firstName + " " + lastName + " your username is " + username);

        } else if (choice.equals("login")) {
        }

        Connection con = Database.getConnection();
        if (con != null) {
            System.out.println("Connected to the database");
        } else {
            System.out.println("Failed to make connection");
        }

        System.out.println("====================================");

    }
    }

