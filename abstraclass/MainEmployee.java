package com.abstraclass;

public class MainEmployee {
public static void main(String args[]) {
	Employee e = new FullTimeEmployee();
	e.calculateSalary();
	e.getEmployeeDetails();
	
	e = new PartTimeEmployee();
	e.calculateSalary();
	e.getEmployeeDetails();
}
}
