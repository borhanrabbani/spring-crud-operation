package com.springcrud.dao;

import java.util.List;

import com.springcrud.entity.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll();

}
