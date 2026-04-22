package com.Throws;

public class MainTest1 {
public static void main(String args[]) {
	Test1 t  = new Test1();
	try {
		t.T1();
	} catch (ClassNotFoundException e) {
		System.out.println("Invalid format");
	}
}
}
