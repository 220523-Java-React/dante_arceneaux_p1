package com.revature.service;

import com.revature.model.Car;

import java.util.ArrayList;
import java.util.List;

public class InfernoAutoService {

    private List<Car> cars;

    public InfernoAutoService(){
        cars = new ArrayList<>();
    }

    public InfernoAutoService(List<Car> cars){
        this.cars = cars;
    }

    public boolean createCar(Car car){
        return cars.add(car);
    }

    public List<Car> getAllCars(){
        return cars;
    }

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
