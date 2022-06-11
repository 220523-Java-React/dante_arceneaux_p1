package com.revature.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.User;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class UserServiceTest {
    /**
     * Method under test: {@link UserService#UserService()}
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     UserService.users

        // Arrange and Act
        new UserService();
    }

    /**
     * Method under test: {@link UserService#UserService()}
     */
    @Test
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     UserService.users

        // Arrange and Act
        new UserService();
    }

    /**
     * Method under test: {@link UserService#UserService(java.util.List)}
     */
    @Test
    void testConstructor3() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     UserService.users

        // Arrange and Act
        new UserService(new ArrayList<>());
    }

    /**
     * Method under test: {@link UserService#UserService()}
     */
    @Test
    void testConstructor4() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     UserService.users

        // Arrange and Act
        new UserService();

    }

    /**
     * Method under test: {@link UserService#UserService()}
     */
    @Test
    void testConstructor5() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     UserService.users

        // Arrange and Act
        new UserService();
    }

    /**
     * Method under test: {@link UserService#UserService(java.util.List)}
     */
    @Test
    void testConstructor6() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     UserService.users

        // Arrange and Act
        new UserService(new ArrayList<>());
    }


    /**
     * Method under test: {@link UserService#createUser(User)}
     */

    UserService userService = new UserService();
    @Test

    void testCreateUser() {
        // Arrange, Act and Assert
        assertTrue(userService.createUser(new User("Jane"
                , "Doe", "janedoe", "iloveyou")));
        assertTrue(userService.createUser(new User("Jane"
                , "Doe", "janedoe", "iloveyou")));
    }
}

