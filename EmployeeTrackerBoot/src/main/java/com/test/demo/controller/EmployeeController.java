package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.demo.model.EmployeeEntity;
import com.test.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employee")
	public void saveEmployee(EmployeeEntity emp) {
		service.saveEmployee(emp);
	
	
}
	
	
	

}
