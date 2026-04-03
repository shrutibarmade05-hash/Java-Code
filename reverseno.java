package com.obj;

public class reverseno {
public static void main(String args[]) {
	int num = 12345;
	int sum = 0;
	int rev = 0;
	
    while(num != 0) {
		int digit = num%10;
		rev = rev*10+digit;
		num = num/10;
		sum = sum+digit;
	}	System.out.println("reverse  no = " +rev);
	
	System.out.println("Addition of all no = " +sum);
	

	}
	
	
	
	

}
