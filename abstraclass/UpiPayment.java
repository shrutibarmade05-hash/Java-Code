package com.abstraclass;

public class UpiPayment extends Payment {
	 @Override
	    public void makePayment(double amount) {
	        System.out.println("UPI Payment of ₹" + amount + " successful.");
	    }
}
