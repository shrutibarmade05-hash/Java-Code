package com.poly;

public class Amazon {
	
	
 void orderPlaced(String name) {
	System.out.println("Product name = "+ name);
}
 void orderPlaced(String name , int prize) {
	 System.out.println("Product name = "+name + "Prize="+prize);
 }
 void orderPlaced(String name , int prize , int quantity) {
	 System.out.println("Product name = "+name + "prize = "  +prize + "Quantity is =" +quantity  );
 }
}
