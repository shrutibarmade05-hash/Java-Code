package com.AbstractInterfaceTask;

public class MainEmployee {
public static void main(String args[]) {
	Employee e = new FullTime();
	e.calculateSalary();
	
	System.out.println("------------------------------------------------------");
	e = new PartTime();
		e.calculateSalary();
	}

}
