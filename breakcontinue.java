package com.src;

public class breakcontinue {

	public static void main(String[] args) {
		
	//	for (int i = 1; i <= 10; i++) {
//			if (i % 2 != 0) {
//				continue; 
//
//			}
//			System.out.println(i);
//
//		}

		
	/*	//---------odd-----------
			
			for(int i = 1; i<=18; i++) {
			if(i%2!=0) {
					continue; 
				}System.out.println(i);
			}
		
	*/	
		
		
//			for (int i = 1; i <= 100; i++) {
//				if (i == 8) {
//					break;  
//			}
//				System.out.println(i);
//		}
	
		
		
//		for (int i = 1; i <= 100; i++) {
//		if (i%4== 0) {
//			continue;
//		}
//			System.out.println(i);
//	}
		
		
		
		
		
		

//for (int i = 1; i <= 100; i++) {
//		if (i%4== 0 || i%10==0) {
//			continue;
//	}
//			System.out.println(i);
//	}
		

		
		
/* for(int i = 10; i>=2; i--) {
	if(i%3 ==0) {
		continue;
	}System.out.println(i);
}
		
		
		
		
		
		
	//------------Print numbers from 1 to 50 but stop when number becomes 25.-----------	
		
		for(int i =1; i<=50;i++) {
			if(i==25) {
				break;
		}
			System.out.println(i);
	}
		
		
		
		
		//--------------Print even numbers from 1 to 100 but stop when you get first odd number.-------------
		
		for(int i =1;i<=100;i++) {
			if(i%2!=0) {
				break;
			}System.out.println(i);
		}
		
	
		
	//-------------------Print table of 9 but stop when product becomes more than 50.----------	
		
		
		for(int i=1;i<=10;i++) {
			int product = i*9;
			if(product>=50) {
				break;
			}System.out.println(product);
		}
			
		
	//-----------------------Print numbers from 1 to 50 but skip numbers divisible by 7.---------------	
		
		for(int i=1;i<=50;i++) {
			if(i%7==0) {
				continue;
			}System.out.println(i);
		}
		
		
		
		
	//----------------Print numbers from 1 to 100 but skip numbers ending with digit 5.------------------	
		
		
		for(int i=1;i<=100;i++) {
			if(i%10==5) {
				continue;
			}System.out.println(i);
		
		}
		
	*/	
	//----------------------Print characters from ‘A’ to ‘Z’ but skip vowels.----------------	
		
		for(char ch= 'A'; ch <= 'Z'; ch++) {
			if(ch == 'A' || ch =='E'|| ch== 'I'|| ch== 'O'|| ch == 'U') {
				continue;
			}System.out.println(ch);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
