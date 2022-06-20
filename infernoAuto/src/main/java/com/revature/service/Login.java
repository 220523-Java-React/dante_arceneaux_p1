package com.revature.service;

import com.revature.database.Database;
import com.revature.database.InsertValue;
import com.revature.database.ReadValue;
import com.revature.model.User;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Login {

    public Login() {
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "====================================");

        System.out.println("   Welcome to the Inferno " +
                "Auto!");
        System.out.println(
                "====================================");

        int loginSuccess = 0;
        String token = "procyon";
        while (loginSuccess == 0) {
            System.out.println("Type: 'sign up' or 'login' to" +
                    " " +
                    "continue.");
            String choice = sc.nextLine();

            try {

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
                    System.out.println("Please enter a unique id number");
                    int id = sc.nextInt();

                    List<ArrayList> ids = Collections.singletonList(readValue.getAllIds());

                    boolean idCheck = false;

                    while (!idCheck) {
                        for (ArrayList idList : ids) {
                            if (idList.contains(id)) {
                                System.out.println("Id already exists");
                                id = sc.nextInt();
                                idCheck = false;
                            } else {
                                idCheck = true;
                            }
                        }
                    }



                    int roleCheck = 0;
                    String role = "";
                    String employeeToken = "";

                    while(roleCheck == 0) {
                        System.out.println("Please enter your role: Type EMPLOYEE or CUSTOMER");
                        role = sc.next();
                        if (role.equals("EMPLOYEE") || role.equals("CUSTOMER")) {
                            roleCheck = 1;
                        } else {
                            System.out.println("Invalid role");
                        }
                    }
                    if (role.equals("EMPLOYEE")) {
                        System.out.println("Please enter employee token");
                        employeeToken = sc.next();
                    }



                    if (employeeToken.equals(token) || role.equals("CUSTOMER")) {
                        InsertValue insertValue = new InsertValue();

                        insertValue.createItem(id, firstName, lastName, username, password, role);

                        System.out.println("You have successfully signed up!");
                        loginSuccess++;
                        System.out.println("Welcome " + firstName + " " + lastName + " your username is " + username);
                    } else {
                        System.out.println("You have failed to sign up!");
                    }

                } else if (choice.equals("login")) {
                    ReadValue readValue = new ReadValue();
                    System.out.println("Please enter your username");
                    String username = sc.next();
                    System.out.println("Please enter your password");
                    String password = sc.next();


                    List<ArrayList> usernames = Collections.singletonList(readValue.getAllUsernames());
                    List<ArrayList> passwords = Collections.singletonList(readValue.getAllPasswords());
                    List<ArrayList> ids = Collections.singletonList(readValue.getAllIds());

                    System.out.println(usernames);
                    System.out.println(passwords);
                    System.out.println(ids);


                    for (int i = 0; i < usernames.size(); i++) {
                        if (usernames.get(i).contains(username) && passwords.get(i).contains(password)) {
                            System.out.println("You have successfully logged in!");
                            System.out.println("Welcome " + username + "!");
                            loginSuccess++;
                            break;
                        } else {
                            System.out.println("Invalid username or password");
                        }
                    }

                }

                Connection con = Database.getConnection();
                if (con != null) {
                    System.out.println("Connected to the database");
                } else {
                    System.out.println("Failed to make connection");
                }

                System.out.println("====================================");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void logout() {
        System.out.println("You have successfully logged out!");
    }


}