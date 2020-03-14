package com.hiberrest.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiberrest.model.Employee;
import com.hiberrest.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save (Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> findOne(Long id) {
		return employeeRepository.findById(id);
	}
	
	public void delete(Employee emp){
		employeeRepository.delete(emp);
	}
}

