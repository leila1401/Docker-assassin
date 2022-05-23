package com.saraya.SpringapplicationbackendwithJavaGuide.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.SpringapplicationbackendwithJavaGuide.exception.ResourceNotFoundException;
import com.saraya.SpringapplicationbackendwithJavaGuide.model.Employee;
import com.saraya.SpringapplicationbackendwithJavaGuide.repository.EmployeeRepository;
import com.saraya.SpringapplicationbackendwithJavaGuide.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee = repo.findById(id);
//		if(employee.isEmpty()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee" , "id" , id);
//		}
		return repo.findById(id).orElseThrow(() ->
				 new ResourceNotFoundException("Employee" , "id" , id));
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		//Check whether employee with given id exist in our DB;
		Employee existingEmployee = repo.findById(id).orElseThrow(()->
				new ResourceNotFoundException("Employee" , "id" , id)); 
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		repo.save(existingEmployee);
		
		return existingEmployee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee" , "id",id));
		
		repo.deleteById(id);
	}
	

}
