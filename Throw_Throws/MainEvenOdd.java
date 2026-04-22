package com.Throw_Throws;

public class MainEvenOdd {
	public static void main(String args[]) {
		EvenOdd e1= new EvenOdd();
		try {
			e1.even(45);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
