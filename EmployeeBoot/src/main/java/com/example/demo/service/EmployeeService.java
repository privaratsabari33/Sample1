package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.EmployeeEntity;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	 public void saveEmployee(EmployeeEntity emp) {
	        dao.save(emp);
	 
	    }
	 
	 public EmployeeEntity getEmployeeById(Long id) throws UserNotFoundException 
	    {
	        Optional<EmployeeEntity> employee = dao.findById(id);
	         
	        if(employee.isPresent()) {
	            return employee.get();
	        } else {
	            throw new UserNotFoundException("No employee record exist for given id");
	        }
	    }
}

