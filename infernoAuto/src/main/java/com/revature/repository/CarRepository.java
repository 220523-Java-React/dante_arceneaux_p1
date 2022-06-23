package com.revature.repository;

import com.revature.model.Car;
import com.revature.model.Offer;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements Dao<Car> {


    @Override
    public Object createObject(Car car) {
        return null;
    }

    User user = new User();

    @Override


    public Car create(Car car) {


        String sql = "INSERT INTO cars (make, model, year, price) VALUES (?, ?, ?, ?)";

        try {
            Connection conn = ConnectionUtility.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, car.getMake());
            ps.setString(2, car.getModel());
            ps.setInt(3, car.getYear());
            ps.setDouble(4, car.getPrice());
            ps.executeUpdate();

            System.out.println("Car added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public List<Car> getAll() {

        List<Car> cars = new ArrayList<>();
        String sql = "select * from cars";

        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while (results.next()) {
                cars.add(new Car()
                        .setId(results.getInt("id"))
                        .setMake(results.getString("make"))
                        .setModel(results.getString("model"))
                        .setYear(results.getInt("year"))
                        .setPrice(results.getDouble("price")));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cars;
    }

    @Override
    public Car getById(int id) {
        return null;
    }


    public Car getCarById(int id) {

        String sql = "select * from cars where id = ?";
        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // build return the user and return it
                return new Car()
                        .setId(rs.getInt("id"))
                        .setMake(rs.getString("make"))
                        .setModel(rs.getString("model"))
                        .setYear(Integer.parseInt(rs.getString("year")))
                        .setPrice(Double.parseDouble(rs.getString("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Car> getCarsByMake(String make) {
        List<Car> cars = new ArrayList<>();
        String sql = "select * from cars where make = ?";

        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, make);

            ResultSet results = stmt.executeQuery();

            while (results.next()) {
                cars.add(new Car()
                        .setId(results.getInt("id"))
                        .setMake(results.getString("make"))
                        .setModel(results.getString("model"))
                        .setYear(results.getInt("year"))
                        .setPrice(results.getDouble("price")));
                System.out.println(cars);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cars;
    }


    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    public Car deleteCarById(int id) {
        String sql = "delete from cars where id = ?";
        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            int success = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Car updateCarById(int id, Car car) {

        String sql = "update cars set make = ?, model = ?, year = ?, price = ? where id = ?";
        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, car.getMake());
            stmt.setString(2, car.getModel());
            stmt.setInt(3, car.getYear());
            stmt.setDouble(4, car.getPrice());
            stmt.setInt(5, id);

            int success = stmt.executeUpdate();
            if (success == 1) {
                return car;
            }

        } catch (SQLException e) {
            //must be an employee
            e.printStackTrace();
            System.out.println("You are not an employee");
        }
        return null;
    }

}

