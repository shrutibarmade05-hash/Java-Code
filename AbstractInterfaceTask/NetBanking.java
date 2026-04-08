package com.AbstractInterfaceTask;

public class NetBanking implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card.");
		
	}

}
