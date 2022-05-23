package com.saraya.SpringapplicationbackendwithJavaGuide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.SpringapplicationbackendwithJavaGuide.model.Employee;
import com.saraya.SpringapplicationbackendwithJavaGuide.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	
	//build create employee REST API
	@PostMapping("/create")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(service.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	//build get all employee REST API
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployee();
	}
	
	//build get employee by id
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(service.getEmployeeById(employeeId), HttpStatus.OK);
	}
	
	//build Update Employee
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee){
		return new ResponseEntity<Employee>(service.updateEmployee(employee, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") long id){
		service.deleteEmployeeById(id);
		return new ResponseEntity<String>("Employee Deleted successfully" , HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
