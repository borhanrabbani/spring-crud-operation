package com.springcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcrud.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManager theEntityManager;
	

	@Autowired
	public EmployeeDAOImpl(EntityManager theEntityManager) {
		this.theEntityManager = theEntityManager;
	}


	@Override
	public List<Employee> findAll() {
		TypedQuery<Employee> theQuery = theEntityManager.createQuery("From employee", Employee.class);
		
		List<Employee> employees = theQuery.getResultList();
		
		return employees;
	}

}
