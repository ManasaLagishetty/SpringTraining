package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Scheduled(fixedRate=5000)
	public void addEmployee() {
		Employee emp=new Employee();
		emp.setName("employee"+new Random().nextInt(123));
		employeeRepo.save(emp);
		System.out.println("adding employee "+new Date().toString());
	}
	
	@Scheduled(fixedRate=15000)
	public void fetchEmployee() {
		
		List<Employee> empl=employeeRepo.findAll();
		
		System.out.println("fetching employees "+new Date().toString());
		
		System.out.println(empl.toString());
		System.out.println("number of records fetched"+empl.size());
	}

}
