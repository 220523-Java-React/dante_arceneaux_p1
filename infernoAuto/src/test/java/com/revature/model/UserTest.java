package com.revature.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class UserTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#User()}
     *   <li>{@link User#setFirstName(String)}
     *   <li>{@link User#setId(int)}
     *   <li>{@link User#setLastName(String)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setRole(Role)}
     *   <li>{@link User#setUsername(String)}
     *   <li>{@link User#getFirstName()}
     *   <li>{@link User#getId()}
     *   <li>{@link User#getLastName()}
     *   <li>{@link User#getPassword()}
     *   <li>{@link User#getRole()}
     *   <li>{@link User#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor() {
        User actualUser = new User();
        actualUser.setFirstName("Jane");
        actualUser.setId(1);
        actualUser.setLastName("Doe");
        actualUser.setPassword("iloveyou");
        actualUser.setRole(Role.USER);
        actualUser.setUsername("janedoe");
        assertEquals("Jane", actualUser.getFirstName());
        assertEquals(1, actualUser.getId());
        assertEquals("Doe", actualUser.getLastName());
        assertEquals("iloveyou", actualUser.getPassword());
        assertEquals(Role.USER, actualUser.getRole());
        assertEquals("janedoe", actualUser.getUsername());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#User(Role, String, String, String, String)}
     *   <li>{@link User#setFirstName(String)}
     *   <li>{@link User#setId(int)}
     *   <li>{@link User#setLastName(String)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setRole(Role)}
     *   <li>{@link User#setUsername(String)}
     *   <li>{@link User#getFirstName()}
     *   <li>{@link User#getId()}
     *   <li>{@link User#getLastName()}
     *   <li>{@link User#getPassword()}
     *   <li>{@link User#getRole()}
     *   <li>{@link User#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        User actualUser = new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou");
        actualUser.setFirstName("Jane");
        actualUser.setId(1);
        actualUser.setLastName("Doe");
        actualUser.setPassword("iloveyou");
        actualUser.setRole(Role.USER);
        actualUser.setUsername("janedoe");
        assertEquals("Jane", actualUser.getFirstName());
        assertEquals(1, actualUser.getId());
        assertEquals("Doe", actualUser.getLastName());
        assertEquals("iloveyou", actualUser.getPassword());
        assertEquals(Role.USER, actualUser.getRole());
        assertEquals("janedoe", actualUser.getUsername());
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou"), null);
        assertNotEquals(new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou"), "Different type to User");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#equals(Object)}
     *   <li>{@link User#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        User user = new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou");
        assertEquals(user, user);
        int expectedHashCodeResult = user.hashCode();
        assertEquals(expectedHashCodeResult, user.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#equals(Object)}
     *   <li>{@link User#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        User user = new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou");
        User user1 = new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou");

        assertEquals(user, user1);
        int expectedHashCodeResult = user.hashCode();
        assertEquals(expectedHashCodeResult, user1.hashCode());
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals4() {
        User user = new User(Role.USER, "First Name", "Doe", "janedoe", "iloveyou");
        assertNotEquals(user, new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals5() {
        User user = new User(Role.USER, "Jane", "Last Name", "janedoe", "iloveyou");
        assertNotEquals(user, new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals6() {
        User user = new User(Role.USER, "Jane", "Doe", "Username", "iloveyou");
        assertNotEquals(user, new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals7() {
        User user = new User(Role.USER, "Jane", "Doe", "janedoe", "Password");
        assertNotEquals(user, new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals8() {
        User user = new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou");
        user.setId(1);
        assertNotEquals(user, new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    void testEquals9() {
        User user = new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou");
        user.setRole(Role.USER);
        assertNotEquals(user, new User(Role.USER, "Jane", "Doe", "janedoe", "iloveyou"));
    }
}

