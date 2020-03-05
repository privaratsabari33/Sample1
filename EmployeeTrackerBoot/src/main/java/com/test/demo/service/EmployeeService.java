package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	 public void saveEmployee(Employee emp) {
	        dao.saveEmployee(emp);
	 
	    }
}
