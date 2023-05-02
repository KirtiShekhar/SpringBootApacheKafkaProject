package com.springboot.thymeleaf.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.thymeleaf.kafka.demo.service.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	// display list of employees
	@GetMapping("/all")
	public String viewHomePage(Model employeeModel)
	{
		employeeModel.addAttribute("listEmployee",employeeService.getAllEmployee());
		return "employeeIndex";
	}
	
}
