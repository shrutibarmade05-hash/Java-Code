package com.abstraclass;

public abstract class FoodOrder {
/* Food Delivery App (like Zomato/Swiggy)
Create abstract class FoodOrder with:
abstract method calculateBill()
concrete method printReceipt()
Subclasses:
DineInOrder
OnlineOrder*/
	
	public abstract void calculateBill();
	
	public void printReceipt(){
		System.out.println("-----Receipt----");
		System.out.println("thank you for your order");
	}
	
	
}
