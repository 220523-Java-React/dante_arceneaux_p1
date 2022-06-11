package com.revature.service;

import com.revature.model.Car;
import com.revature.model.User;

import java.util.ArrayList;
import java.util.List;

public class InfernoAutoService {

    private List<Car> cars; //list of cars

    public InfernoAutoService(){
        cars = new ArrayList<>(); //create a new list of cars
    }

    public boolean createCar(Car car){
        return cars.add(car); //add the car to the list
    }

    public List<Car> getAllCars(){
        return cars;
    } //get all cars from the list

    public Car getCarById(int id){
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getId() == id){
                return cars.get(i);
            }
        }

        return null;
    }

    public boolean deleteCarById(int id){
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getId() == id){
                cars.remove(i);
                return true;
            }
        }

        return false;
    }


    public boolean updateCar(Car car){
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getId() == car.getId()){
                cars.set(i, car);
                return true;
            }
        }

        return false;
    }



}
