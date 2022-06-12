package com.revature;

import com.revature.controller.InfernoAutoController;
import com.revature.database.InsertValue;
import com.revature.model.Car;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.service.UserService;
import io.javalin.Javalin;

import java.sql.*;

import java.util.Scanner;


public class Driver {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Inferno Auto!");
        System.out.println("sign up or login to continue?");

        if (sc.nextLine().equals("sign up")) {
            System.out.println("Please enter your id");
            int id = sc.nextInt();
            System.out.println("Please enter your first name");
            String firstName = sc.next();
            System.out.println("Please enter your last name");
            String lastName = sc.next();
            System.out.println("Please enter your username");
            String username = sc.next();
            System.out.println("Please enter your password");
            String password = sc.next();
            InsertValue insertValue = new InsertValue();

            insertValue.createItem(id, firstName, lastName, username, password);
        }




        InfernoAutoController infernoAutoController = new InfernoAutoController();

        Javalin app = Javalin.create().start(8008);

        app.get("/", context -> context.result("Welcome to the InfernoAutoAPI"));

        app.post("/user", infernoAutoController.createUser);
        app.get("/user/all",
                infernoAutoController.getAllUsers);
        app.get("/cars/all",
                infernoAutoController.getAllCars);
        app.get("/cars/{id}", infernoAutoController.getCarById);
        app.post("/cars", infernoAutoController.createCar);
        app.delete("/cars/{id}", infernoAutoController.deleteCarById);
        app.put("/cars", infernoAutoController.updateCar);



    }





}
