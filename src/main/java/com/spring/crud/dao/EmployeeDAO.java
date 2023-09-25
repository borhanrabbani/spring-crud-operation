package com.spring.crud.dao;

import java.util.List;

import com.spring.crud.entity.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll();
	
	

}
