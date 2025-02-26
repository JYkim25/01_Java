package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {

	private Employee[] employees;
	private int employeeCount;
	
	
	
	
	public Company(int size) {
		Employee[] emps = new Employee[size];
		employeeCount = 0;
		
	}
	
	
	
	
	
	public Employee[] getEmployees() {
		return employees;
	}





	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}





	public int getEmployeeCount() {
		return employeeCount;
	}





	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}





	@Override
	public void addPerson(Person person) {
		person = new Employee();
		
		for(int i = 0; i < emps.length; i++) {
			if(emps[i] == null) {
				emps[i]
			}
			
		}
		
	}
	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displayAllPersons() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
