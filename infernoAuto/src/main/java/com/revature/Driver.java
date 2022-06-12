package com.revature;

import com.revature.controller.InfernoAutoController;
import com.revature.database.InsertValue;
import com.revature.database.ReadValue;
import com.revature.model.Car;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.service.UserService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.javalin.Javalin;

import java.sql.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Inferno Auto!");
        System.out.println("sign up or login to continue?");

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
        System.out.println(ids);

        for(ArrayList i : ids){
            if(i.contains(id)){
                System.out.println("Your id is already in the" +
                        " database.  Your new id will be " + (id + 1));
            }
            while(i.contains(id)){
                id++;
            }
        }


        InsertValue insertValue = new InsertValue();



        System.out.println(id);

                insertValue.createItem(id, firstName, lastName, username, password);

                System.out.println("You have successfully signed up!");


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
