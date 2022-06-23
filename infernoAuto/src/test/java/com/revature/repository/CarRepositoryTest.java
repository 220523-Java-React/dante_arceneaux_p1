package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.Car;
import com.revature.model.User;
import org.junit.jupiter.api.Test;

class CarRepositoryTest {
    /**
     * Method under test: default or parameterless constructor of {@link CarRepository}
     */
    @Test
    void testConstructor2() {
        User user = (new CarRepository()).user;
        assertNull(user.getFirstName());
        assertNull(user.getUsername());
        assertNull(user.getRole());
        assertNull(user.getPassword());
        assertNull(user.getLastName());
        assertEquals(0, user.getId());
    }

    /**
     * Method under test: {@link CarRepository#createObject(Car)}
     */
    @Test
    void testCreateObject() {
        CarRepository carRepository = new CarRepository();
        assertNull(carRepository.createObject(new Car(1, "Make", "Model", 1, 10.0d)));
    }

    /**
     * Method under test: {@link CarRepository#createObject(Car)}
     */
    @Test
    void testCreateObject2() {
        CarRepository carRepository = new CarRepository();
        assertNull(carRepository.createObject(new Car(1, "Make", "Model", 1, 10.0d)));
    }

    /**
     * Method under test: {@link CarRepository#create(Car)}
     */
    @Test
    void testCreate() {
        CarRepository carRepository = new CarRepository();
        assertNull(carRepository.create(new Car(1, "Make", "Model", 1, 10.0d)));
    }

    /**
     * Method under test: {@link CarRepository#create(Car)}
     */
    @Test
    void testCreate2() {
        CarRepository carRepository = new CarRepository();
        assertNull(carRepository.create(new Car(1, "Make", "Model", 1, 10.0d)));
    }

    /**
     * Method under test: {@link CarRepository#getAll()}
     */
    @Test
    void testGetAll() {
        assertTrue((new CarRepository()).getAll().isEmpty());
        assertTrue((new CarRepository()).getAll().isEmpty());
    }

    /**
     * Method under test: {@link CarRepository#getCarById(int)}
     */
    @Test
    void testGetCarById() {
        assertNull((new CarRepository()).getCarById(1));
        assertNull((new CarRepository()).getCarById(1));
    }

    /**
     * Method under test: {@link CarRepository#getCarsByMake(String)}
     */
    @Test
    void testGetCarsByMake() {
        assertTrue((new CarRepository()).getCarsByMake("Make").isEmpty());
        assertTrue((new CarRepository()).getCarsByMake("Make").isEmpty());
    }

    /**
     * Method under test: {@link CarRepository#update(Car)}
     */
    @Test
    void testUpdate() {
        CarRepository carRepository = new CarRepository();
        assertNull(carRepository.update(new Car(1, "Make", "Model", 1, 10.0d)));
    }

    /**
     * Method under test: {@link CarRepository#update(Car)}
     */
    @Test
    void testUpdate2() {
        CarRepository carRepository = new CarRepository();
        assertNull(carRepository.update(new Car(1, "Make", "Model", 1, 10.0d)));
    }

    /**
     * Method under test: {@link CarRepository#deleteById(int)}
     */
    @Test
    void testDeleteById() {
        assertFalse((new CarRepository()).deleteById(1));
        assertFalse((new CarRepository()).deleteById(1));
    }

    /**
     * Method under test: {@link CarRepository#deleteCarById(int)}
     */
    @Test
    void testDeleteCarById() {
        assertNull((new CarRepository()).deleteCarById(1));
        assertNull((new CarRepository()).deleteCarById(1));
    }

    /**
     * Method under test: {@link CarRepository#updateCarById(int, Car)}
     */
    @Test
    void testUpdateCarById() {
        CarRepository carRepository = new CarRepository();
        assertNull(carRepository.updateCarById(1, new Car(1, "Make", "Model", 1, 10.0d)));
    }

    /**
     * Method under test: {@link CarRepository#updateCarById(int, Car)}
     */
    @Test
    void testUpdateCarById2() {
        CarRepository carRepository = new CarRepository();
        assertNull(carRepository.updateCarById(1, new Car(1, "Make", "Model", 1, 10.0d)));
    }

    /**
     * Method under test: default or parameterless constructor of {@link CarRepository}
     */
    @Test
    void testConstructor() {
        User user = (new CarRepository()).user;
        assertNull(user.getFirstName());
        assertNull(user.getUsername());
        assertNull(user.getRole());
        assertNull(user.getPassword());
        assertNull(user.getLastName());
        assertEquals(0, user.getId());
    }
}

