package com.AbstractInterfaceTask;

public class MainShoopingg {
public static void main(String args[]) {
	Shoppingg n = new Electronics();
	n.applyDiscount();
	n.Product();
	System.out.println("------------------------------------");
	n = new Clothing();
	n.applyDiscount();
	n.Product();
	
	
}
}
