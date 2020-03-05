package com.test.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public interface EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveEmployee(Employee emp) {
	
	
	        jdbcTemplate.update("INSERT INTO employee (id, name,designation,location, time) VALUES (?, ?, ?, ?,?)",
	            emp.getId(), emp.getName(), emp.getDesignation(), emp.getLocation(), emp.getTime());
	        System.out.println("Data Saved");
	  
	    }
}
