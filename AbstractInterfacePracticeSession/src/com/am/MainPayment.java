package com.am;

public class MainPayment {
public static void main(String args[]) {
	System.out.println("-----Credit card paymnet------");
	Payment p = new CreditCardPayment();
	p.pay(56000);
	
	System.out.println("-----Upi Payment------");
	p= new UpiPayment();
	p.pay(54000.18);
	
	System.out.println("-----Net Banking------");
	p = new NetBanking();
	p.pay(239452.23);
}
}
