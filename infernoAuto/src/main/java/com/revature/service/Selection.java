package com.revature.service;

import com.revature.database.InsertValue;
import com.revature.database.ReadValue;
import com.revature.repository.CarRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Selection {


    public void startProgram() {

        InsertValue insertValue = new InsertValue();
        ReadValue readValue = new ReadValue();
        CarRepository carRepository = new CarRepository();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the InfernoAUTO!");
        System.out.println("====================================");

        System.out.println("Please choose the following options to continue: ");
        System.out.println("1: View all available vehicles: ");
        System.out.println("2: Make an offer on a vehicle: ");
        System.out.println("3: View all cars that you own: ");
        System.out.println("4: See all offers you've made: ");
        System.out.println("5: Update offer: ");
        System.out.println("6: Delete offer: ");
        System.out.println("For Employees ONLY");
        System.out.println("7: Add car to the lot: ");
        System.out.println("8: Delete car from the lot: ");
        System.out.println("9: accept or reject offer: ");



        try {

            int success = 0;
            while (success == 0) {
                try {
                    int selection = scanner.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.println("View all available vehicles: ");
                            ;
                            List<ArrayList> cars = Collections.singletonList(readValue.getAllCars());

                             selection = scanner.nextInt();


                        case 2:

                            System.out.println("Make an offer on a vehicle: ");
                            System.out.println("Enter offer type (buy, sell, or lease): ");
                            String offer_type = scanner.next();
                            System.out.println("Please offer price");
                            int offer_price = scanner.nextInt();
                            String offer_status = "open";
                            if (offer_type.equals("buy") || offer_type.equals("sell") || offer_type.equals("lease")) {
                                success = 1;
                                insertValue.createOffer(offer_type, offer_price, offer_status);

                            } else {
                                System.out.println("Invalid offer type");

                            }

                            System.out.println("Congratulations! You've made an offer!");

                            break;

                        case 3:
                            System.out.println("View all cars that you own: ");
                            break;
                        case 4:
                            System.out.println("See all offers you've made: ");
                            break;
                        case 5:
                            System.out.println("Update offer: ");
                            break;
                        case 6:
                            System.out.println("Delete offer: ");
                            break;



                        case 7:

                            int roleCheck = 0;
                            String role = "";
                            String token = "procyon";
                            String employeeToken = "";

                            while(roleCheck == 0) {
                                System.out.println("Please enter your role: Type EMPLOYEE or CUSTOMER");
                                role = scanner.next();
                                System.out.println("Please enter employee token");
                                employeeToken = scanner.next();

                                if (role.equals("EMPLOYEE")) {
                                    System.out.println("Please enter employee token");
                                    employeeToken = scanner.next();
                                    if (role.equals("EMPLOYEE") && employeeToken.equals(token)) {
                                        roleCheck = 1;
                                    } else {
                                        System.out.println("Invalid role");
                                    }
                                }
                                else {
                                    System.out.println("Invalid role");
                                    roleCheck = 0;
                                }
                            }


                            System.out.println("Add car to the lot: ");
                            System.out.println("Please enter the car's make: ");
                            String make = scanner.next();
                            System.out.println("Please enter the car's model: ");
                            String model = scanner.next();
                            System.out.println("Please enter the car's year: ");
                            int year = scanner.nextInt();
                            System.out.println("Please enter the car's price: ");
                            int price = scanner.nextInt();

                            insertValue.createCar(make, model, year, price);

                            System.out.println("Congratulations! You've added a car!");



                            break;
                        case 8:
                            System.out.println("Delete car from the lot: ");
                            break;
                        case 9:
                            System.out.println("accept or reject offer: ");
                            success = 1;
                            break;
                        default:
                            System.out.println("Invalid selection");
                            break;

                    }

                } catch (Exception e) {
                    System.out.println("Invalid selection");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid selection");
        }

    }
}
