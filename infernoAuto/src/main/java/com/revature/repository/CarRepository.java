package com.revature.repository;

import com.revature.model.Car;
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
            } catch (SQLException e) {
                e.printStackTrace();

            }
return null;
    }
    @Override
    public List<Car> getAll() {

        List<Car> cars = new ArrayList<>();
        String sql = "select * from cars";

        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while(results.next()){
                cars.add(new Car()
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

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}

