package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.User;
import org.junit.jupiter.api.Test;

class UserRepositoryTest {
    /**
     * Method under test: {@link UserRepository#create(User)}
     */
    @Test
    void testCreate() {
        // Arrange
        UserRepository userRepository = new UserRepository();

        // Act and Assert
        assertNull(userRepository.create(new User("Jane", "Doe", "janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link UserRepository#getAll()}
     */
    @Test
    void testGetAll() {
        // Arrange, Act and Assert
        assertTrue((new UserRepository()).getAll().isEmpty());
    }

    /**
     * Method under test: {@link UserRepository#update(User)}
     */
    @Test
    void testUpdate() {
        // Arrange
        UserRepository userRepository = new UserRepository();

        // Act and Assert
        assertNull(userRepository.update(new User("Jane", "Doe", "janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link UserRepository#deleteById(int)}
     */
    @Test
    void testDeleteById() {
        // Arrange, Act and Assert
        assertFalse((new UserRepository()).deleteById(1));
    }

    /**
     * Method under test: {@link UserRepository#createUser(Object)}
     */
    @Test
    void testCreateUser() {
        // Arrange, Act and Assert
        assertNull((new UserRepository()).createUser("42"));
    }

    /**
     * Method under test: default or parameterless constructor of {@link UserRepository}
     */
    @Test
    void testConstructor() {
        // Arrange, Act and Assert
        assertTrue((new UserRepository()).getAll().isEmpty());
    }
}

