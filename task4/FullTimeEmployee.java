package com.task4;

public class FullTimeEmployee implements Employee {
	 int basic = 30000;
	    int bonus = 5000;

	    @Override
	    public void calculateSalary() {
	        int salary = basic + bonus;
	        System.out.println("Full Time Employee Salary = " + salary);
	    }
}
