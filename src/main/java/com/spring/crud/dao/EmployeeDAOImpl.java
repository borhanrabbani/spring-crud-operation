package com.spring.crud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	

	@Autowired
	public EmployeeDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}


	@Override
	public List<Employee> findAll() {
//		TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
//		
//		List<Employee> employees = theQuery.getResultList();
		
		TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
		List<Employee> employees = query.getResultList();

		
		return employees;
	}


	@Override
	public Employee findById(int id) {
		Employee theEmployee = entityManager.find(Employee.class, id);
		return theEmployee;
	}


	@Override
	public Employee save(Employee theEmployee) {
		Employee dbEmployee = entityManager.merge(theEmployee);
		
		return dbEmployee;
	}


	@Override
	public void deleteById(int id) {
		Employee theEmployee = entityManager.find(Employee.class, id);
		entityManager.remove(theEmployee);
	}

}
