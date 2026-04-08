package com.AbstractInterfaceTask;

public class MainFood {
public static void main(String args[]) {
	FoodDeliverySystem f = new VegOrder();
	f.orderDetails();
	f.prepareFood();
	
	
	f = new NonVegOrder();
	f.orderDetails();
	f.prepareFood();
	
}
}
