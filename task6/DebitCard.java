package com.task6;

public class DebitCard implements Payment{
	  public void pay(double amount) {
	        System.out.println("Paid " + amount + " via Debit Card");
	    }
}
