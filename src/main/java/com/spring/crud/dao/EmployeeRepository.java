package com.spring.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
