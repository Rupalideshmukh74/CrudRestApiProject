package com.bikkadIT.service;

import java.util.List;

import com.bikkadIT.model.Employee;

public interface EmpServiceI {
	
	public Integer addEmployee(Employee employee);
	
	public Employee getById(Integer id);
	
	public List<Employee> getByAll();

}
