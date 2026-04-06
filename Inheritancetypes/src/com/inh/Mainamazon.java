package com.inh;

public class Mainamazon {
public static void main(String args[]) {
	 System.out.println("=== Single Level Inheritance ===");
     Amazonshopping shopping = new Amazonshopping();
     shopping.showCompany();      // Parent method
     shopping.shoppingFeatures(); // Child method

     System.out.println("\n=== Multi-Level Inheritance ===");
     Amazonprime prime = new Amazonprime();
     prime.showCompany();         // Grandparent method
   //  prime.shoppingFeatures();    // Parent method
   //  prime.primeFeatures();       // Child method

     System.out.println("\n=== Hierarchical Inheritance ===");
     Amazonprime pay = new Amazonprime();
     pay.showCompany();           // Parent method
   //  pay.payFeatures();           // Child method
}
}
