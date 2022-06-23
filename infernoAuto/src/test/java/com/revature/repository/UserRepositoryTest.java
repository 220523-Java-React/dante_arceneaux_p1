package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.Role;
import com.revature.model.User;
import org.junit.jupiter.api.Test;

class UserRepositoryTest {
    /**
     * Method under test: {@link UserRepository#createObject(User)}
     */
    @Test
    void testCreateObject() {
        UserRepository userRepository = new UserRepository();
        assertNull(userRepository.createObject(new User("Jane", "Doe", "janedoe", "iloveyou", Role.CUSTOMER, 1)));
    }

    /**
     * Method under test: {@link UserRepository#create(User)}
     */
    @Test
    void testCreate() {
        UserRepository userRepository = new UserRepository();
        assertNull(userRepository.create(new User("Jane", "Doe", "janedoe", "iloveyou", Role.CUSTOMER, 1)));
    }

    /**
     * Method under test: {@link UserRepository#create(User)}
     */
    @Test
    void testCreate2() {
        UserRepository userRepository = new UserRepository();
        assertNull(userRepository
                .create(new User("insert into users(first_name, last_name, username, password, role) values(?,?,?,?,?)", "Doe",
                        "janedoe", "iloveyou", Role.CUSTOMER, 1)));
    }

    /**
     * Method under test: {@link UserRepository#getAll()}
     */
    @Test
    void testGetAll() {
        assertTrue((new UserRepository()).getAll().isEmpty());
    }

    /**
     * Method under test: {@link UserRepository#getById(int)}
     */
    @Test
    void testGetById() {
        assertNull((new UserRepository()).getById(1));
    }

    /**
     * Method under test: {@link UserRepository#update(User)}
     */
    @Test
    void testUpdate() {
        UserRepository userRepository = new UserRepository();
        assertNull(userRepository.update(new User("Jane", "Doe", "janedoe", "iloveyou", Role.CUSTOMER, 1)));
    }

    /**
     * Method under test: {@link UserRepository#deleteById(int)}
     */
    @Test
    void testDeleteById() {
        assertFalse((new UserRepository()).deleteById(1));
    }

    /**
     * Method under test: {@link UserRepository#createUser(Object)}
     */
    @Test
    void testCreateUser() {
        assertNull((new UserRepository()).createUser("42"));
    }

    /**
     * Method under test: {@link UserRepository#getUserByUsername(String)}
     */
    @Test
    void testGetUserByUsername() {
        assertNull((new UserRepository()).getUserByUsername("janedoe"));
    }

    /**
     * Method under test: {@link UserRepository#getByUsername(String)}
     */
    @Test
    void testGetByUsername() {
        assertNull((new UserRepository()).getByUsername("janedoe"));
    }

    /**
     * Method under test: {@link UserRepository#updateUserById(int, User)}
     */
    @Test
    void testUpdateUserById() {
        UserRepository userRepository = new UserRepository();
        assertNull(userRepository.updateUserById(1, new User("Jane", "Doe", "janedoe", "iloveyou", Role.CUSTOMER, 1)));
    }

    /**
     * Method under test: {@link UserRepository#deleteUserById(int)}
     */
    @Test
    void testDeleteUserById() {
        assertNull((new UserRepository()).deleteUserById(1));
        assertNull((new UserRepository()).deleteUserById(123));
        assertNull((new UserRepository()).deleteUserById(1));
    }
}

