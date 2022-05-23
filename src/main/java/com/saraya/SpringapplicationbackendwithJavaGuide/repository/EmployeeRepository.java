package com.saraya.SpringapplicationbackendwithJavaGuide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.SpringapplicationbackendwithJavaGuide.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long> {
}
