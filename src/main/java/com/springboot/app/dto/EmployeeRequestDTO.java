package com.springboot.app.dto;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class EmployeeRequestDTO {
	
    @NotBlank(message = "Name is required")
	private String name;
    
    @NotBlank(message = "Phone is required")
	private String phone;
    
    @NotBlank(message = "Department is required")
	private String department;
    
    @NotBlank(message = "Designation is required")
	private String designation;
    
    @Positive(message = "Salary must be greater than zero")
	private double salary;
	
	public EmployeeRequestDTO() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
