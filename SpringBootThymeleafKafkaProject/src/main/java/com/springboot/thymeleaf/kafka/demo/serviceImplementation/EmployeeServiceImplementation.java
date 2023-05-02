package com.springboot.thymeleaf.kafka.demo.serviceImplementation;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.thymeleaf.kafka.demo.dto.EmployeeRequest;
import com.springboot.thymeleaf.kafka.demo.entity.Employee;
import com.springboot.thymeleaf.kafka.demo.service.EmployeeService;
import com.springboot.thymeleaf.kafka.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository; 

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(EmployeeRequest employeeRequest) 
	{
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeRequest, employee);
		employeeRepository.saveAndFlush(employee);
	}

}
