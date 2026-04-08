package com.abstraclass;

public abstract class Product {
/*E-Commerce Platform (like Amazon)
Create abstract class Product with:
abstract method calculateDiscount()
concrete method displayProductDetails()
Subclasses:
Electronics
Clothing*/
	
	public abstract void caluclateDiscount();
	
	public void displayProductDetails(){
		System.out.println("Displaying Product Details");
	}
		
	
}
