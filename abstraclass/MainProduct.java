package com.abstraclass;

public class MainProduct {
public static void main(String args[]) {
	Product p = new Electronics();
	p.caluclateDiscount();
	p.displayProductDetails();
	
	p = new Clothing();
	p.caluclateDiscount();
	p.displayProductDetails();
}
}
