package com.assignment.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional; // Import this annotation

import com.assignment.springboot.entity.EmployeeEntity;
import com.assignment.springboot.repository.EmployeeRepository;

@SpringBootTest
@AutoConfigureTestEntityManager
@ActiveProfiles("test")
@Transactional // Add this annotation to manage transactions
public class EmployeeRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveEmployee() {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        // Set other fields as needed

        EmployeeEntity savedEmployee = entityManager.persistAndFlush(employee);
        EmployeeEntity retrievedEmployee = employeeRepository.findById(savedEmployee.getId()).orElse(null);

        assertNotNull(retrievedEmployee);
        assertEquals("John", retrievedEmployee.getFirstName());
        // Assert other fields as needed
    }
}
