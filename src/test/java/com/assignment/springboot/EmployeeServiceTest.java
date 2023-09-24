package com.assignment.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.assignment.springboot.entity.EmployeeEntity;
import com.assignment.springboot.repository.EmployeeRepository;
import com.assignment.springboot.serviceImpl.EmployeeServiceImpl;

public class EmployeeServiceTest {

    private EmployeeServiceImpl employeeService;
    private EmployeeRepository employeeRepository;

    @BeforeEach
    public void setUp() {
        employeeRepository = mock(EmployeeRepository.class);
        employeeService = new EmployeeServiceImpl(employeeRepository);
    }

    @Test
    public void testCreateEmployee() {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        // Set other fields as needed

        when(employeeRepository.save(employee)).thenReturn(employee);

        String result = employeeService.createEmployee(employee);

        assertEquals("Employee created successfully", result);
    }
}
