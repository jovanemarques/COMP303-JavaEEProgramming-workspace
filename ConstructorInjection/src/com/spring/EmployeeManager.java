package com.spring;

public class EmployeeManager {
	Employee emp;
	public void printMessage() {
		this.emp.printMessage();
	}
	
	private EmployeeManager(Employee employee) {
		this.emp = employee;
	}
}
