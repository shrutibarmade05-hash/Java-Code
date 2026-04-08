package com.abstraclass;

public abstract class Payment {
/*Payment Gateway
Create abstract class Payment with:
abstract method makePayment(amount)
concrete method generateReceipt()
Subclasses:
UPIPayment
CardPayment*/
	
	public  abstract void  makePayment(double amount);
	
	public void generateReceipt() {
		System.out.println("Receipt generated. Thank you for your payment!");
	}
		
	
}
