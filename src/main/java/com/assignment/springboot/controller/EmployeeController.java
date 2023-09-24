package com.assignment.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springboot.entity.EmployeeEntity;
import com.assignment.springboot.service.EmployeeService;

//@RequestMapping("/Employee")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/createEmployee")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeEntity employee){
	String createEmployee = employeeService.createEmployee(employee);
		return new ResponseEntity<>("Stored data successfull", HttpStatus.CREATED);
	}

}
