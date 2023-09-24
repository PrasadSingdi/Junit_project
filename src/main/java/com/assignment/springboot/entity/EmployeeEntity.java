package com.assignment.springboot.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="test")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private Long mobileNumber;
	private Integer age;
	private LocalDate dob;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;
}
