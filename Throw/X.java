package com.Throw;

public class X {
public void a1() {
	int i=34;
	
	
	if(i%2==0) {
		throw new CustomException("Number is  even");
	}else {
		throw new CustomException("Number is odd");
	}
}
}
