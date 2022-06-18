package com.revature.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.User;
import com.revature.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    /**
     * Method under test: {@link UserService#UserService(UserRepository)}
     */
    @Test
    void testConstructor() {
        // Arrange
        UserRepository userRepository = new UserRepository();

        // Act
        UserService actualUserService = new UserService(userRepository);

        // Assert
        assertTrue(actualUserService.getAllUsers().isEmpty());
        UserRepository userRepository1 = actualUserService.userRepository;
        assertTrue(userRepository1.getAll().isEmpty());
        assertSame(userRepository1, userRepository);
    }

    /**
     * Method under test: {@link UserService#UserService()}
     */
    @Test
    void testConstructor2() {
        // Arrange, Act and Assert
        assertTrue((new UserService()).getAllUsers().isEmpty());
    }

    /**
     * Method under test: {@link UserService#createUser(User)}
     */
    @Test
    void testCreateUser() {
        // Arrange
        UserService userService = new UserService();

        // Act and Assert
        assertNull(userService.createUser(new User("Jane", "Doe", "janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link UserService#createUser(User)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateUser2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.revature.service.UserService.createUser(UserService.java:22)
        //   In order to prevent createUser(User)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createUser(User).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        UserService userService = new UserService(null);

        // Act
        userService.createUser(new User("Jane", "Doe", "janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link UserService#getAllUsers()}
     */
    @Test
    void testGetAllUsers() {
        // Arrange, Act and Assert
        assertTrue((new UserService()).getAllUsers().isEmpty());
    }

    /**
     * Method under test: {@link UserService#getAllUsers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllUsers2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.revature.service.UserService.getAllUsers(UserService.java:26)
        //   In order to prevent getAllUsers()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getAllUsers().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new UserService(null)).getAllUsers();
    }

    /**
     * Method under test: {@link UserService#getUserById(int)}
     */
    @Test
    void testGetUserById() {
        // Arrange, Act and Assert
        assertNull((new UserService()).getUserById(1));
    }

    /**
     * Method under test: {@link UserService#getUserById(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserById2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.revature.service.UserService.getUserById(UserService.java:30)
        //   In order to prevent getUserById(int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getUserById(int).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new UserService(null)).getUserById(1);
    }

    /**
     * Method under test: {@link UserService#deleteUserById(int)}
     */
    @Test
    void testDeleteUserById() {
        // Arrange, Act and Assert
        assertFalse((new UserService()).deleteUserById(1));
    }

    /**
     * Method under test: {@link UserService#deleteUserById(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteUserById2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.revature.service.UserService.deleteUserById(UserService.java:34)
        //   In order to prevent deleteUserById(int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   deleteUserById(int).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new UserService(null)).deleteUserById(1);
    }
}

