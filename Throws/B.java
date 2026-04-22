package com.Throws;

public class B {

	public void m2() throws Exception {
		A a = new A();
		try {
			a.m1();
		} catch (ClassNotFoundException e) {
			System.out.println(" This is not allowed in Java");
			}
		
	}
}
