package com.revature;

import com.revature.controller.InfernoAutoController;
import com.revature.model.Car;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.service.UserService;
import io.javalin.Javalin;


public class Driver {

    public static void main(String[] args) {




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
