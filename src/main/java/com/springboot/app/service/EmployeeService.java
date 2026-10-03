package com.springboot.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.springboot.app.dto.EmployeeRequestDTO;
import com.springboot.app.dto.EmployeeResponseDTO;
import com.springboot.app.entity.Employee;
import com.springboot.app.exception.EmployeeNotFoundException;
import com.springboot.app.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository employeeRepository;
	
	public static final Logger logger = org.slf4j.LoggerFactory.getLogger(EmployeeService.class);
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<EmployeeResponseDTO> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		List<EmployeeResponseDTO> empdtos = new ArrayList<EmployeeResponseDTO>();
		
		for(Employee emp : employees) {
			empdtos.add(convertToResponseDTO(emp));
		}
        return empdtos;
    }
	public EmployeeResponseDTO getEmployee(long id) {	
		Employee emp =  employeeRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee with Id "+id+" Not Found"));
		return convertToResponseDTO(emp);
	}
	
	
	public EmployeeResponseDTO addEmployee(EmployeeRequestDTO empdto) {
		
		logger.info("Adding New Employee : {}", empdto.getName());
		
		Employee emp = new Employee();
		emp.setName(empdto.getName());
		emp.setPhone(empdto.getPhone());
		emp.setDepartment(empdto.getDepartment());
		emp.setDesignation(empdto.getDesignation());
		emp.setSalary(empdto.getSalary());
		employeeRepository.save(emp);
		EmployeeResponseDTO empresdto = convertToResponseDTO(emp);
		logger.info("Employee Create Successfully with id {}",emp.getId() );
		return empresdto;
	}
	
	public void deleteEmployee(long id) {
		Employee emp = employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee with Id "+id+" Not Found"));
		employeeRepository.delete(emp);
	}
	
	public EmployeeResponseDTO updateEmployee(long id, EmployeeRequestDTO empdto) {
		Employee emp = employeeRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee with Id "+id+" Not Found"));
		
		emp.setName(empdto.getName());
		emp.setPhone(empdto.getPhone());
		emp.setDepartment(empdto.getDepartment());
		emp.setDesignation(empdto.getDesignation());
		emp.setSalary(empdto.getSalary());
		return convertToResponseDTO(employeeRepository.save(emp));
	}
	
	private EmployeeResponseDTO convertToResponseDTO(Employee emp) {
		EmployeeResponseDTO empdto = new EmployeeResponseDTO();
		
		empdto.setId(emp.getId());
		empdto.setName(emp.getName());
		empdto.setPhone(emp.getPhone());
		empdto.setDepartment(emp.getDepartment());
		empdto.setDesignation(emp.getDesignation());
		empdto.setSalary(emp.getSalary());
		return empdto;
	}
	

}
