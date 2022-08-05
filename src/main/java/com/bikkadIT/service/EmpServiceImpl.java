package com.bikkadIT.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIT.model.Employee;
import com.bikkadIT.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpServiceI {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Integer addEmployee(Employee employee) {
		
		Employee save = employeeRepository.save(employee);
		return save.getEmpId();
	}
	@Override
	public Employee getById(Integer id) {
		Employee employee = employeeRepository.findById(id).get();
		return employee;
	}
	@Override
	public List<Employee> getByAll() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}
	

}
