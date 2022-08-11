package com.tectoro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tectoro.entity.Employee;
import com.tectoro.repository.IEmployeeRepository;
import com.tectoro.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repository;


    @Override
	public Employee saveEmp(Employee employee) {

		return repository.insert(employee);
	}
}
