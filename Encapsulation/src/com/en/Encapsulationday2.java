package com.en;

public class Encapsulationday2 {

//-----------1. Create a class Student with private variables id and name.
//Provide getters and setters. Write a program to set values and print them.**------------------------------------------
	
	/*
	private int id;
	private String name;
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	
	
	
2. Create a class BankAccount using encapsulation with private balance.
Add methods: deposit(), withdraw(), getBalance().
Perform operations in main.**--------------------------------------------------------------------------
	
	private double balance;
	
	public double getbalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance = balance+amount;
	}
	public void withraw(double amount) {
		balance = balance-amount;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
3. Create a class Employee with private salary.
Add validation in setter: salary must be > 0, otherwise print error.**----------------------------
	

	
	private double salary;
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		if(salary>0) {
			this.salary =salary;
		}else {
			System.out.println("error");
		}
	}
	
	
	
4. Create a class Car with private fields brand and price.
	Provide setters and getters and print details.**----------------------------------------------------
	
	
	 private String model;
	    private String brand;
	    private int enginecc;
	    
	    public String getmodel() {
	    	return model;
	    }
	    public void setmodel(String model) {
	    	this.model = model;
	    }
	    
	    
	    public String getbrand() {
	    	return brand;
	    }
	    public void setbrand(String brand) {
	    	this.brand = brand;
	    }
	    
	    
	    public int getenginecc() {
	    	return enginecc;
	    }
	    public void setenginecc(int enginecc) {
	    	this.enginecc =enginecc;
	   } 



5. Create a class Product using encapsulation and calculate discount using getter and setter methods-----------------------


	 private double price;
	    private double discount;

	    void setPrice(double p) {
	        price = p;
	    }

	    void setDiscount(double d) {
	        discount = d;
	    }

	    double getFinalPrice() {
	        return price - (price * discount / 100);
	    }
	

 6. Write a method printMessage() (no parameter, no return) that prints "Welcome to Java".	----------------------------------
	
	
	public void printMessage() {
		System.out.println("Welcome to java");
	}

	
7. Write a method add(int a, int b) (parameterized, no return) that prints the sum.-------------------------------------
	
	
	public void sum() {
		int a = 32;
		int b =34;
		int c = a+b;
		System.out.println(c);
		
	}
	
	
8. Write a method multiply(int a, int b) (parameterized, returns result).---------------	
	
	public int  multiply( int a , int b) {
		int c = a*b;
    	System.out.println(c);
		return c;
		}
		
	
10. Write a method isEven(int n) (parameterized return type boolean) that checks even/odd.---------------*/
	
	
	
	public void even(int n) {
		if( n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
