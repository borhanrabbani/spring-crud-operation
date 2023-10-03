package com.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.crud.dao.EmployeeDAO;
import com.spring.crud.entity.Employee;

import jakarta.transaction.Transactional;

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



	@Override
	public Employee findById(int id) {
		
		return employeeDao.findById(id);
	}



	@Transactional
	@Override
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		return employeeDao.save(theEmployee);
	}



	@Transactional
	@Override
	public void deleteById(int id) {
		employeeDao.deleteById(id);
	}

}
