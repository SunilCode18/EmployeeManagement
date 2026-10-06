package com.springboot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	public List<Employee> findByNameContainingIgnoreCaseOrDesignationContainingIgnoreCaseOrDepartmentContainingIgnoreCase(String name, String designation, String department);

}
