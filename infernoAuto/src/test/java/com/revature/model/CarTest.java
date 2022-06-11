package com.revature.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Car#Car()}
     *   <li>{@link Car#setColor(String)}
     *   <li>{@link Car#setDescription(String)}
     *   <li>{@link Car#setId(int)}
     *   <li>{@link Car#setImage(String)}
     *   <li>{@link Car#setMake(String)}
     *   <li>{@link Car#setMileage(int)}
     *   <li>{@link Car#setModel(String)}
     *   <li>{@link Car#setPrice(double)}
     *   <li>{@link Car#setYear(int)}
     *   <li>{@link Car#getColor()}
     *   <li>{@link Car#getDescription()}
     *   <li>{@link Car#getId()}
     *   <li>{@link Car#getImage()}
     *   <li>{@link Car#getMileage()}
     *   <li>{@link Car#getModel()}
     *   <li>{@link Car#getPrice()}
     *   <li>{@link Car#getYear()}
     * </ul>
     */
    @Test
    void testConstructor() {
        // Arrange and Act
        Car actualCar = new Car();
        actualCar.setColor("Color");
        actualCar.setDescription("The characteristics of someone or something");
        actualCar.setId(1);
        actualCar.setImage("Image");
        actualCar.setMake("Make");
        actualCar.setMileage(1);
        actualCar.setModel("Model");
        actualCar.setPrice(10.0d);
        actualCar.setYear(1);

        // Assert
        assertEquals("Color", actualCar.getColor());
        assertEquals("The characteristics of someone or something", actualCar.getDescription());
        assertEquals(1, actualCar.getId());
        assertEquals("Image", actualCar.getImage());
        assertEquals(1, actualCar.getMileage());
        assertEquals("Model", actualCar.getModel());
        assertEquals(10.0d, actualCar.getPrice());
        assertEquals(1, actualCar.getYear());
    }

    /**
     * Method under test: {@link Car#Car(String, String, int, int, String, double, String, int)}
     */
    @Test
    void testConstructor2() {
        // Arrange and Act
        Car actualCar = new Car("Make", "Model", 1, 1, "Color", 10.0d, "The characteristics of someone or something", 1);

        // Assert
        assertEquals("Color", actualCar.getColor());
        assertEquals("Make", actualCar.make);
        assertEquals(1, actualCar.getYear());
        assertEquals(10.0d, actualCar.getPrice());
        assertEquals("Model", actualCar.getModel());
        assertEquals(1, actualCar.getMileage());
        assertEquals(1, actualCar.getId());
        assertEquals("The characteristics of someone or something", actualCar.getDescription());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Car#Car()}
     *   <li>{@link Car#setColor(String)}
     *   <li>{@link Car#setDescription(String)}
     *   <li>{@link Car#setId(int)}
     *   <li>{@link Car#setImage(String)}
     *   <li>{@link Car#setMake(String)}
     *   <li>{@link Car#setMileage(int)}
     *   <li>{@link Car#setModel(String)}
     *   <li>{@link Car#setPrice(double)}
     *   <li>{@link Car#setYear(int)}
     *   <li>{@link Car#getColor()}
     *   <li>{@link Car#getDescription()}
     *   <li>{@link Car#getId()}
     *   <li>{@link Car#getImage()}
     *   <li>{@link Car#getMileage()}
     *   <li>{@link Car#getModel()}
     *   <li>{@link Car#getPrice()}
     *   <li>{@link Car#getYear()}
     * </ul>
     */
    @Test
    void testConstructor3() {
        // Arrange and Act
        Car actualCar = new Car();
        actualCar.setColor("Color");
        actualCar.setDescription("The characteristics of someone or something");
        actualCar.setId(1);
        actualCar.setImage("Image");
        actualCar.setMake("Make");
        actualCar.setMileage(1);
        actualCar.setModel("Model");
        actualCar.setPrice(10.0d);
        actualCar.setYear(1);

        // Assert
        assertEquals("Color", actualCar.getColor());
        assertEquals("The characteristics of someone or something", actualCar.getDescription());
        assertEquals(1, actualCar.getId());
        assertEquals("Image", actualCar.getImage());
        assertEquals(1, actualCar.getMileage());
        assertEquals("Model", actualCar.getModel());
        assertEquals(10.0d, actualCar.getPrice());
        assertEquals(1, actualCar.getYear());
    }

    /**
     * Method under test: {@link Car#Car(String, String, int, int, String, double, String, int)}
     */
    @Test
    void testConstructor4() {
        // Arrange and Act
        Car actualCar = new Car("Make", "Model", 1, 1, "Color", 10.0d, "The characteristics of someone or something", 1);

        // Assert
        assertEquals("Color", actualCar.getColor());
        assertEquals("Make", actualCar.make);
        assertEquals(1, actualCar.getYear());
        assertEquals(10.0d, actualCar.getPrice());
        assertEquals("Model", actualCar.getModel());
        assertEquals(1, actualCar.getMileage());
        assertEquals(1, actualCar.getId());
        assertEquals("The characteristics of someone or something", actualCar.getDescription());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Car#Car()}
     *   <li>{@link Car#setColor(String)}
     *   <li>{@link Car#setDescription(String)}
     *   <li>{@link Car#setId(int)}
     *   <li>{@link Car#setImage(String)}
     *   <li>{@link Car#setMake(String)}
     *   <li>{@link Car#setMileage(int)}
     *   <li>{@link Car#setModel(String)}
     *   <li>{@link Car#setPrice(double)}
     *   <li>{@link Car#setYear(int)}
     *   <li>{@link Car#getColor()}
     *   <li>{@link Car#getDescription()}
     *   <li>{@link Car#getId()}
     *   <li>{@link Car#getImage()}
     *   <li>{@link Car#getMileage()}
     *   <li>{@link Car#getModel()}
     *   <li>{@link Car#getPrice()}
     *   <li>{@link Car#getYear()}
     * </ul>
     */
    @Test
    void testConstructor5() {
        // Arrange and Act
        Car actualCar = new Car();
        actualCar.setColor("Color");
        actualCar.setDescription("The characteristics of someone or something");
        actualCar.setId(1);
        actualCar.setImage("Image");
        actualCar.setMake("Make");
        actualCar.setMileage(1);
        actualCar.setModel("Model");
        actualCar.setPrice(10.0d);
        actualCar.setYear(1);

        // Assert
        assertEquals("Color", actualCar.getColor());
        assertEquals("The characteristics of someone or something", actualCar.getDescription());
        assertEquals(1, actualCar.getId());
        assertEquals("Image", actualCar.getImage());
        assertEquals(1, actualCar.getMileage());
        assertEquals("Model", actualCar.getModel());
        assertEquals(10.0d, actualCar.getPrice());
        assertEquals(1, actualCar.getYear());
    }

    /**
     * Method under test: {@link Car#Car(String, String, int, int, String, double, String, int)}
     */
    @Test
    void testConstructor6() {
        // Arrange and Act
        Car actualCar = new Car("Make", "Model", 1, 1, "Color", 10.0d, "The characteristics of someone or something", 1);

        // Assert
        assertEquals("Color", actualCar.getColor());
        assertEquals("Make", actualCar.make);
        assertEquals(1, actualCar.getYear());
        assertEquals(10.0d, actualCar.getPrice());
        assertEquals("Model", actualCar.getModel());
        assertEquals(1, actualCar.getMileage());
        assertEquals(1, actualCar.getId());
        assertEquals("The characteristics of someone or something", actualCar.getDescription());
    }
}

