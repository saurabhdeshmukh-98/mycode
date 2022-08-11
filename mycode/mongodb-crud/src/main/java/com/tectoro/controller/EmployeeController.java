package com.tectoro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.entity.Employee;
import com.tectoro.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired(required = true)
	private IEmployeeService service;

	/*
	 * @Autowired public EmployeeController(IEmployeeService service) { this.service
	 * = service; }
	 */
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee) {
		return ResponseEntity.ok(service.saveEmp(employee));
	}
	
	

}
