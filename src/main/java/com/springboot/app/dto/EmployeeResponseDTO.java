package com.springboot.app.dto;

public class EmployeeResponseDTO {
	
	private long id;
	private String name;
	private String phone;
	private String department;
	private String designation;
	private double salary;
	
	public EmployeeResponseDTO() {
	}
	
	

	public EmployeeResponseDTO(long id, String name, String phone, String department, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

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
