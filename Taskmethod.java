package com.mtd;

public class Taskmethod {
	
//------------------even odd program--------------------------------------------------------------------------
/*	
//non-parametrized without return type---------------
      public void checkEvenOdd(){
		 int  num = 20;
		 if(num%2==0) {
			 System.out.println("Number Is Even");
		 }else {
			 System.out.println("Number is Odd");
		 }
	}
	

// non-parametrized with return type--------------
	public int  checkEvenOdd() {
		int num =10;
	if(num%2==0) {
		System.out.println("Number is Even");
	}else {
		System.out.println("Number is Odd");
		
		}
	return 0;
	}


// parametrized without return type--------------
    public void checkEvenOdd(int num) {
		if(num%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}

// parametrized with return type-----------------
	public String checkEvenOdd(int n) {
		if(n %2 == 0) {
			return "even";
		}else {
			return "odd";
	}

		

	
//--------------Reverse no ---------------------------------------------------------------------------------
	
//non-parametrized without return type------------------
	public void checkReverseno() {
		   int num = 1245;
		   int rev = 0;
		   while(num>0) {
			   rev = rev*10+num%10;
			   num = num/10;
		   }System.out.println(rev);
		   }

	
//non-parametrized with return type---------------
	public int checkReverseno() {
		int rev = 0;
		int num =35546;
		while(num>0){
			rev = rev*10+num%10;
			num = num/10;
		}System.out.println(rev);
		return rev;
	}
	
		
// parametrized without return type--------------
    public void checkReverseno(int num ) {
		int rev = 0;
	while(num>0){
			rev = rev*10+num%10;
			num = num/10;
		}System.out.println(rev);

	
// parametrized with return type--------------
	public int checkReverseno(int num) {
		int rev = 0;
		while(num>0){
			rev = rev*10+num%10;
			num = num/10;
		}System.out.println(rev);
		return rev;
	}
	
	
	
	
//-----------------------------Return the largest two number------------------------------------
	
//non-parametrized without return type--------------
	public void largestNumber() {
		int a =10;
		int b = 4;
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
	}
	
	
// non-parametrized with return type---------------
	public int largestNumber() {
		int a =54;
		int b = 74;
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		return b;
	}
	

// parametrized without return type---------------
	public void largestNumber(int a , int b) {
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		
	}

	
// parametrized with return type----------------
	public int largestNumber(int a ,int b) {
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		return b; 
	}	
	
		
	
		
//--------------Create method to find square of number---------------------------------------------------
	
	
//non-parametrized without return type----------------
	public void findSquare() {
	 int num = 5;
	 int square = num*num;
	 System.out.println(square);
	}


	
// non-parametrized with return type-----------------
	 public int findSquare() {
			 int num = 6;
			 int square = num*num;
			 System.out.println(square);
			 return  square;
			}

// parametrized without return type----------------
	 public void findSquare(int num ) {
		 int square = num*num;
		 System.out.println(square); 
		}
	
// parametrized with return type-----------------
	public int findSquare(int num ) {
		 int square = num*num;
		 System.out.println(square); 
		 return square;
		}
	
	
//--------------------Create method to add two numbers--------------------------------------------------------------
	
//non-parametrized without return type--------------
	public void myAddition() {
			int a = 10;
			int b = 45;
			int c = a+b;
			
			System.out.println(c);
	      }
			
// non-parametrized with return type------------
	public int myAddition() {
			int a = 10;
			int b = 45;
			int c = a+b;
			
			System.out.println(c);
			return c;
	    }
	
	
// parametrized without return type--------------
	public void myAddition(int a , int b) {
		int c = a+b;
	System.out.println(c);
      }
	
	*/
	
	
// parametrized with return type----------------
	public int myAddition(int a ,int b) {
				int c = a+b;
	      System.out.println(c);
				return c;
		      }
	
}
	

