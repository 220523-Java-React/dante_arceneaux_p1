package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.revature.model.Car;
import org.junit.jupiter.api.Test;

class CarRepositoryTest {
    /**
     * Method under test: {@link CarRepository#createUser(Object)}
     */
    @Test
    void testCreateUser() {
        // Arrange, Act and Assert
        assertNull((new CarRepository()).createUser("42"));
    }

    /**
     * Method under test: {@link CarRepository#create(Car)}
     */
    @Test
    void testCreate() {
        // Arrange
        CarRepository carRepository = new CarRepository();

        // Act and Assert
        assertNull(carRepository
                .create(new Car("Make", "Model", 1, 1, "Color", 10.0d, "The characteristics of someone or something", 1)));
    }

    /**
     * Method under test: {@link CarRepository#update(Car)}
     */
    @Test
    void testUpdate() {
        // Arrange
        CarRepository carRepository = new CarRepository();

        // Act and Assert
        assertNull(carRepository
                .update(new Car("Make", "Model", 1, 1, "Color", 10.0d, "The characteristics of someone or something", 1)));
    }

    /**
     * Method under test: {@link CarRepository#deleteById(int)}
     */
    @Test
    void testDeleteById() {
        // Arrange, Act and Assert
        assertFalse((new CarRepository()).deleteById(1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link CarRepository}
     *   <li>{@link CarRepository#getAll()}
     * </ul>
     */
    @Test
    void testConstructor() {
        // Arrange, Act and Assert
        assertNull((new CarRepository()).getAll());
    }
}

