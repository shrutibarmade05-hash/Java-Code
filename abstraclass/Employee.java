package com.abstraclass;

public abstract class Employee {
/*Employee Management System
Create abstract class Employee with:
abstract method calculateSalary()
concrete method getEmployeeDetails()
Subclasses:
FullTimeEmployee
PartTimeEmployee
*/
	
	public abstract void calculateSalary();
	
	public void getEmployeeDetails() {
		System.out.println("------employee details----------------");
		 System.out.println("Name: John Doe");
	        System.out.println("ID: 101");
	}
}
