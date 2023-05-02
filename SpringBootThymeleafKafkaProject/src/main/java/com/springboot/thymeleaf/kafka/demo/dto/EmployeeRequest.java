package com.springboot.thymeleaf.kafka.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest 
{
	private String employeeName;
	private String employeeEmailAddress;
	private String employeeContactNumber;
	private String employeeAddress;
}
