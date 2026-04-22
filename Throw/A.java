package com.Throw;

public class A {
public void m1() {
	int a = 2;
	int b = 0;
	
	
	if(b==0) {
		
		throw new CustomException("this is divide by zero is not possible in java");
	}
	System.out.println(a/b);
}
}
