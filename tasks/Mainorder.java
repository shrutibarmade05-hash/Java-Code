package com.tasks;

public class Mainorder {
public static void main(String args[]) {
	FoodOrder f = new OnlineOrder();
	System.out.println("-------------------------Online order-----------------------");

	f.calculateBill();
	f.printReceipt();
	System.out.println("-------------------------Dine in order-----------------------");
	f = new DineInOrder();
	f.calculateBill();
	f.printReceipt();
}
}
