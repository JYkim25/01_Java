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
	
	
	


	@Override
	public void addPerson(Person person) {
		
		if (person instanceof Employee && employeeCount < employees.length) {
			employees[employeeCount++] = (Employee) person;
			System.out.println("직원이 추가되었습니다" + person.getInfo());
			
		} else {
			
			System.out.println("인원이 모두 충원되어 더 이상 추가 못함");
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
