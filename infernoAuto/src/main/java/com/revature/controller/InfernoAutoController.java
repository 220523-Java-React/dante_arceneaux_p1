package com.revature.controller;

import com.revature.Driver;
import com.revature.model.Car;
import com.revature.model.Offer;
import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.service.InfernoAutoService;
import com.revature.service.OfferService;
import io.javalin.http.Handler;

import java.util.List;

public class InfernoAutoController extends Driver {


    InfernoAutoService infernoAutoService = new InfernoAutoService();
    UserRepository userDao = new UserRepository();



    public Handler getAllCars = ctx -> {
        List<Car> cars;// create a new list of cars
        cars = infernoAutoService.getAllCars();// get all cars from the service
        ctx.json(cars);// send the list of cars to the client

    };

    public Handler getCarById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the url
        Car car = infernoAutoService.getCarById(id); // get the car from the service
        ctx.json(car); // send the car to the client
    };

    public Handler createCar = ctx -> {
        Car car = ctx.bodyAsClass(Car.class); // get the car from the client
        infernoAutoService.createCar(car); // create the car in the service
        ctx.status(201); // set the status code to 201
    };

    //create user



    public Handler deleteCarById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the url
        infernoAutoService.deleteCarById(id); // delete the car from the service
        ctx.status(204); // set the status code to 204
    };

    public Handler updateCar = ctx -> {
        Car car = ctx.bodyAsClass(Car.class); // get the car from the client
        infernoAutoService.updateCar(car); // update the car in the service
        ctx.status(204); // set the status code to 204
    };


}
