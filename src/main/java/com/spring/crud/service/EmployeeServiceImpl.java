package com.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.crud.dao.EmployeeDAO;
import com.spring.crud.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDao;
	
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDao) {
		employeeDao = theEmployeeDao;
	}



	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

}
