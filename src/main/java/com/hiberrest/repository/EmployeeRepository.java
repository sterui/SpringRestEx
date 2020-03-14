package com.hiberrest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hiberrest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
