package com.abstraclass;

public class OnlineOrder extends FoodOrder {
double amount;
	@Override
	public void calculateBill() {
		amount = 500;
		System.out.println("total online order bill amount is " +amount);
		
	}

}
