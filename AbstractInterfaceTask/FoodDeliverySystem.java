package com.AbstractInterfaceTask;

public abstract class FoodDeliverySystem {
/*9. Food Delivery System (Abstract Class)
Abstract class FoodOrder:
abstract method prepareFood()
concrete method orderDetails()
Subclasses:
VegOrder
NonVegOrder*/
	
	
	public abstract void prepareFood();
	
	public void orderDetails() {
		System.out.println("customer name is shruti");
	}
	
}
