package com.task4;

public class PartTimeEmployee implements Employee {
	int hoursWorked = 80;
    int ratePerHour = 200;
    
	@Override
	

    public void calculateSalary() {
        int salary = hoursWorked * ratePerHour;
        System.out.println("Part Time Employee Salary = " + salary);
    }
	}

