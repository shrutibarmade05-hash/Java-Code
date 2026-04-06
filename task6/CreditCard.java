package com.task6;

public class CreditCard implements Payment  {
	 public void pay(double amount) {
	        System.out.println("Paid " + amount + " via Credit Card");
	    }
}
