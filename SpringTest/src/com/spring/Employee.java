package com.spring;

public class Employee {
	String employeeName;
	public void printMessage() {
		System.out.println(employeeName + " Welcome to Spring");
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
