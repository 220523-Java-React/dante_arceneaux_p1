package com.revature.controller;

import com.revature.Driver;
import com.revature.model.Employee;
import com.revature.model.User;
import com.revature.repository.EmployeeRepository;
import com.revature.service.UserService;
import io.javalin.http.Handler;

public class EmployeeController extends Driver {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    public Handler getAllEmployees = ctx -> {
        ctx.json(employeeRepository.getAllEmployees());
        ctx.status(201);
    };


    public Handler createEmployee = ctx -> {
        Employee employee = ctx.bodyAsClass(Employee.class);
        employeeRepository.createEmployee(employee);
        ctx.status(201); // set the status code to 201
    };


}
