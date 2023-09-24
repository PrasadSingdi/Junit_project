package com.assignment.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.springboot.entity.EmployeeEntity;
import com.assignment.springboot.repository.EmployeeRepository;
import com.assignment.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String createEmployee(EmployeeEntity employee) {
        //EmployeeEntity employee = new EmployeeEntity();
        //BeanUtils.copyProperties(employees, employee);
        
        // Save the employee to the repository
        employeeRepository.save(employee);
        
        // Return the success message
        return "Employee created successfully";
    }
}
