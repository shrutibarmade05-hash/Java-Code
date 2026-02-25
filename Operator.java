package com.op;

public class Operator {

	public static void main (String args[]) {
		int a = 10;
		int b = 20;
		int c = a+b;
		int d = a / b;
		
		System.out.println("Addition of " + a + " + " + b + " = " + c); // 30
     	System.out.println("Sub of " + a + " - " + b + " = " + (a - b)); // 10
		System.out.println("Mul of " + a + " * " + b + " = " + (a * b)); // 200
		System.out.println("Div of " + a + " / " + b + " = " + (d / c) + " Quotient"); // 2
		System.out.println("Mod of " + a + " % " + b + " = " + (c % b) + " Remainder"); // 0

	}
}



