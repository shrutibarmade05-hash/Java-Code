package com.abstraclass;

public class CardPayment extends Payment {
	 @Override
	    public void makePayment(double amount) {
	        System.out.println("Card Payment of ₹" + amount + " successful.");
	    }
}
