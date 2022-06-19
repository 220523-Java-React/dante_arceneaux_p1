package com.revature.repository;

import com.revature.model.Employee;
import com.revature.model.User;
import com.revature.util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements Dao<Employee> {


    public Object createObject(User user) {
        return null;
    }

    @Override
    public Object createObject(Employee employee) {
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        // we are receiving a full user object
        // we need a query to insert that record
        //                                                                                1,2,3,4
        String sql = "insert into employees(first_name, last_name, username, password) values(?,?,?,?)";

        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, employee.getFirstName());
            stmt.setString(2, employee.getLastName());
            stmt.setString(3, employee.getUsername());
            stmt.setString(4, employee.getPassword());


            int success = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }


    public List<Employee> getAllEmployees() {
        // Empty lists of users, will add any new users from the result set
        List<Employee> employees = new ArrayList<>();


        String sql = "select * from employees";
        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while (results.next()) {
                // go through each result, build a User object for that data, add that user object the users list
                Employee employee = new Employee();
                employee.setFirstName(results.getString("first_name"));
                employee.setLastName(results.getString("last_name"));
                employee.setUsername(results.getString("username"));
                employee.setPassword(results.getString("password"));

                employees.add(employee);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    @Override
    public Employee getById(int id) {

        return null;
    }

    @Override
    public Employee update(Employee employees) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    public Object createEmployee(Object o) {

        return null;
    }

}