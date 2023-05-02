package com.springboot.thymeleaf.kafka.demo.service;

import java.util.List;

import com.springboot.thymeleaf.kafka.demo.dto.EmployeeRequest;
import com.springboot.thymeleaf.kafka.demo.entity.Employee;

public interface EmployeeService 
{
	List<Employee> getAllEmployee();
	void saveEmployee(EmployeeRequest employeeRequest);
}
