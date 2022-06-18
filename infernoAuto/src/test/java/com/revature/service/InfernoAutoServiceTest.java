package com.revature.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.Car;
import org.junit.jupiter.api.Test;

class InfernoAutoServiceTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link InfernoAutoService}
     *   <li>{@link InfernoAutoService#getAllCars()}
     * </ul>
     */
    @Test
    void testConstructor() {
        // Arrange, Act and Assert
        assertTrue((new InfernoAutoService()).getAllCars().isEmpty());
    }

    /**
     * Method under test: {@link InfernoAutoService#createCar(Car)}
     */
    @Test
    void testCreateCar() {
        // Arrange
        InfernoAutoService infernoAutoService = new InfernoAutoService();

        // Act and Assert
        assertTrue(infernoAutoService
                .createCar(new Car("Make", "Model", 1, 1, "Color", 10.0d, "The characteristics of someone or something", 1)));
        assertEquals(1, infernoAutoService.getAllCars().size());
    }

    /**
     * Method under test: {@link InfernoAutoService#getCarById(int)}
     */
    @Test
    void testGetCarById() {
        // Arrange, Act and Assert
        assertNull((new InfernoAutoService()).getCarById(1));
    }

    /**
     * Method under test: {@link InfernoAutoService#deleteCarById(int)}
     */
    @Test
    void testDeleteCarById() {
        // Arrange, Act and Assert
        assertFalse((new InfernoAutoService()).deleteCarById(1));
    }

    /**
     * Method under test: {@link InfernoAutoService#updateCar(Car)}
     */
    @Test
    void testUpdateCar() {
        // Arrange
        InfernoAutoService infernoAutoService = new InfernoAutoService();

        // Act and Assert
        assertFalse(infernoAutoService
                .updateCar(new Car("Make", "Model", 1, 1, "Color", 10.0d, "The characteristics of someone or something", 1)));
    }
}

