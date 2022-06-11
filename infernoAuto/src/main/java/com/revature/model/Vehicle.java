package com.revature.model;

public abstract class Vehicle {

    int wheels;
    int doors;
    int seats;


void drive() {
    System.out.println("Driving");
}

void brake() {
    System.out.println("Stopping");
}

void start() {
    System.out.println("Starting");
}

void park() {
    System.out.println("Parking");
}

}
