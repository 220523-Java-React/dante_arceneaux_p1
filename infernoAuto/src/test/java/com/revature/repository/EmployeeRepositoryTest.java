package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.Employee;
import com.revature.model.Role;
import com.revature.model.User;
import org.junit.jupiter.api.Test;

class  EmployeeRepositoryTest {
    /**
     * Method under test: {@link EmployeeRepository#createObject(Employee)}
     */
    @Test
    void testCreateObject() {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee employee = new Employee();
        employee.setFirstName("Jane");
        employee.setLastName("Doe");
        employee.setPassword("iloveyou");
        employee.setUsername("janedoe");
        assertNull(employeeRepository.createObject(employee));
    }

    /**
     * Method under test: {@link EmployeeRepository#createObject(User)}
     */
    @Test
    void testCreateObject2() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        assertNull(employeeRepository.createObject(new User("Jane", "Doe", "janedoe", "iloveyou", Role.CUSTOMER, 1)));
    }

    /**
     * Method under test: {@link EmployeeRepository#create(Employee)}
     */
    @Test
    void testCreate() {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee employee = new Employee();
        employee.setFirstName("Jane");
        employee.setLastName("Doe");
        employee.setPassword("iloveyou");
        employee.setUsername("janedoe");
        assertNull(employeeRepository.create(employee));
    }

    /**
     * Method under test: {@link EmployeeRepository#getAllEmployees()}
     */
    @Test
    void testGetAllEmployees() {
        assertTrue((new EmployeeRepository()).getAllEmployees().isEmpty());
    }

    /**
     * Method under test: {@link EmployeeRepository#update(Employee)}
     */
    @Test
    void testUpdate() {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee employee = new Employee();
        employee.setFirstName("Jane");
        employee.setLastName("Doe");
        employee.setPassword("iloveyou");
        employee.setUsername("janedoe");
        assertNull(employeeRepository.update(employee));
    }

    /**
     * Method under test: {@link EmployeeRepository#deleteById(int)}
     */
    @Test
    void testDeleteById() {
        assertFalse((new EmployeeRepository()).deleteById(1));
    }

    /**
     * Method under test: {@link EmployeeRepository#createEmployee(Object)}
     */
    @Test
    void testCreateEmployee() {
        assertNull((new EmployeeRepository()).createEmployee("42"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link EmployeeRepository}
     *   <li>{@link EmployeeRepository#getAll()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertNull((new EmployeeRepository()).getAll());
    }
}

