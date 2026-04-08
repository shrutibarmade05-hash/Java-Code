package com.tasks;

public class MainPayment {
	
	    public static void main(String[] args) {

	        Payment payment = new UpiPayment();
	        payment.makePayment(1500);
	        payment.generateReceipt();

	        System.out.println("-------------------");

	        payment = new CardPayment();
	        payment.makePayment(2500);
	        payment.generateReceipt();
	    }
	
}
