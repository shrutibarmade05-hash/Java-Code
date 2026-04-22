package com.Throw;

public class Palindrome {
public void m1() {
	int num = 453;
	int org = num;
	int rev = 0;
	while(num>0) {
		rev = rev*10+num%10;
		num= num/10;
	}
	if(org==rev) {
		throw new CustomException("Palindrome");
	}else{
		throw new CustomException("Not Palindrome");
	}
}
}
