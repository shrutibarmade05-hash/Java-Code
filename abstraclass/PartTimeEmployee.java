package com.abstraclass;

public class PartTimeEmployee extends Employee{

    @Override
    public void calculateSalary() {
        System.out.println("Part-Time Employee Salary = 20000");
    }
}
