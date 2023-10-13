package com.spring.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.crud.dao.EmployeeRepository;
import com.spring.crud.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}



	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}



	@Override
	public Employee findById(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		
		Employee theEmployee = null;
		
		if(result.isPresent()) {
			theEmployee = result.get();
		}else {
			throw new RuntimeException("couldn't find employee ID: " + id);
		}
		
		return theEmployee;
	}



	@Override
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(theEmployee);
	}



	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}
	
	@Override
	public List<Employee> searchEmployees(String keyword) {
		return employeeRepository.search(keyword);
	}

}
