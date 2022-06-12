package com.revature.model;

import com.revature.repository.DAO;

import java.util.Objects;

public class Car extends Vehicle {

    String make;
    String model;
    int year;
    int mileage;
    String color;
    double price;
    String description;

    int id;



    public Car(){
    }

    public Car(String make, String model, int year, int mileage, String color, double price,
               String description, int id) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.price = price;
        this.description = description;
        this.id = id;
    }

    public void getMake(String make) {
        this.make = make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





}
