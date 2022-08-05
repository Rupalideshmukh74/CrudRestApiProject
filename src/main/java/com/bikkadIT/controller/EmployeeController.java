package com.bikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.model.Employee;
import com.bikkadIT.service.EmpServiceI;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmpServiceI empServiceI;
	
	@PostMapping(value="/addEmployee", consumes="application/json",produces="application/json")
	public ResponseEntity<Integer> addEmployee(@RequestBody Employee employee) {
		Integer addEmployee = empServiceI.addEmployee(employee);
		
		return new ResponseEntity<Integer>(addEmployee,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/getById/{id}",produces="application/json",consumes="application/json")
	public ResponseEntity <Employee> getById(@PathVariable Integer id) {
		
		Employee byId = empServiceI.getById(id);
		return new ResponseEntity<Employee>(byId,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/getByAll",produces="application/json")
	public ResponseEntity<List<Employee>> getByAll(){
		List<Employee> byAll = empServiceI.getByAll();
		return new ResponseEntity<List<Employee>> (byAll,HttpStatus.OK);
		
	}

}
