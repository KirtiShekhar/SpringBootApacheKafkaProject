package com.springboot.thymeleaf.kafka.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeId")
	private Long employeeId;
	@Column(name = "employeeName")
	private String employeeName;
	@Column(name = "employeeEmailAddress")
	private String employeeEmailAddress;
	@Column(name = "employeeContactNumber")
	private String employeeContactNumber;
	@Column(name = "employeeAddress")
	private String employeeAddress;
}
