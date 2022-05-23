package com.saraya.SpringapplicationbackendwithJavaGuide.service;

import java.util.List;

import com.saraya.SpringapplicationbackendwithJavaGuide.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee , long id);
	void deleteEmployeeById(long id);

}
