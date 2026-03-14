package com.src;

public class practiceifelse {

	public static void main(String[] args) {
	
//------------------------------------------Practise Questions based on If else : ------------------------
		
		
//----------1. Write a Java program to check if a number is positive.--------
		
	/*	int num = 4;
		if(num>0) {
			System.out.println("num is positive");}
		else {
			System.out.println("num is negative");
		}
		
		
		
		
//---------------------	Write a program to check if a number is divisible by 5.=------------
		
		
		int num = 37;
		if(num%5==0) {
			System.out.println("num is divisible by 5");}
		else {
			System.out.println("num is not divisible by 5");
		}
		
		
		
//-------------------	Write a program to check if a number is greater than 100.-------------
		
		

		int num = 498;
		if(num>100) {
			System.out.println("num is greater than 100");}
		else {
			System.out.println("num is not greater than 100");
		}	
		
		
		
		
//-------------Write a program to check if a character is uppercase.-------------
		
		
		char ch = 'a';
		if(ch>='A' && ch <='Z')
		{
			System.out.println("Uppercase");
			
		}else {
			System.out.println(" Not Uppercase");
		}
	
		
		
		
//--------------Write a program to check if a person is eligible for voting (age ≥ 18).---------------
		
		
		int age = 45;
		if(age>=18) {
			System.out.println("Eligible For Voting   ");
		}else {
			System.out.println(" Not Eligible For Voting   ");
		}
		
		
			
//------------Write a program to check whether a number is even or odd.----------
		
		int num = 74;
		if(num%2==0) {
			System.out.println("num is even");}
		else {
			System.out.println("num is odd");
		}	
		
		
//------------Write a program to find the greater number between two numbers.------
		
		int a = 35;
		int b = 987;
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("a is less than b");
		}
		
		
		
		
//---------Write a program to check whether a number is positive or negative.-----------
		
		int num = -74;
		if(num>0) {
			System.out.println("num is positive");}
		else {
			System.out.println("num is negative");
		}
		
		
//------------Write a program to check whether a number is divisible by 2 or not.----------

			
			int num = 37;
		if(num%2==0) {
			System.out.println("num is divisible by 2");}
		else {
			System.out.println("num is not divisible by 2");
		}
		
		
		
//--Write a program to check whether a character is vowel or consonant.----------
		
		char ch = 'b';
		if(ch=='A' || ch =='E' || ch=='I' || ch =='O' || ch=='U' || ch =='a' || ch=='e' || ch =='i' || ch=='o' || ch =='u')
		{
			System.out.println("Vowel");
		}
		else {
			System.out.println(" Constant");}
			
			
			
//------------------------------if else ladder------------------------------------=-----------------
			
			
//-=----------------------Write a program to find the largest among three numbers.----------
		 
		int a = 10;
		int b = 25;
		int c = 15;
		 if(a>b && a<c) {
			 System.out.println("a is greater");
		 }else if (b>a && b>c) {
			 System.out.println("b is greater");
		 }else {
			 System.out.println("c is greater");
		 }
		
		
//--------------Write a program to display grade based on marks.--------------------
		int marks= 95;
		if( marks >= 75) {
			System.out.println("Distinction");
		}else if(marks >= 60) {
			System.out.println("First Class");
		}else if(marks >= 50) {
			System.out.println("Second Class");
		}	else if(marks >= 35) {
				System.out.println("Pass");
		}else {
			System.out.println("Fail");
	}
		/
		
		
//-----------Write a program to check whether a character is vowel, consonant, digit, or special character.
		
		char ch = '@';
		if(ch=='A' || ch =='E' || ch=='I' || ch =='O' || ch=='U' || ch =='a' || ch=='e' || ch =='i' || ch=='o' || ch =='u')
		{
			System.out.println("Vowel");
		}else if(ch >='0' && ch <='9') {
			System.out.println("digit");
			}else {
				System.out.println("character");
			}
		
		
//-------------Write a program to display day name based on day number (1–7).------------
		
		
		int num= 2;
		if(num == 1) {
			System.out.println("Monday");
		}else if(num == 2) {
			System.out.println("Tuesday");
		}else if(num== 3) {
			System.out.println("Wednesday");
		}else if(num== 4) {
			System.out.println("Thuresday");
		}else if(num== 5) {
			System.out.println("Friday");
		}else if(num==6) {
			System.out.println("Saturday");
		}else if(num ==7) {
			System.out.println("Sunday");
	} else {
		System.out.println("Invalid Data");
	}
	
		
		
//-------------Write a program to calculate electricity bill based on units.-----------
		
		int units = 334;
		int bill;
		 if(units <=100) {
			 bill = units*5;}
		 
			 else if(units <=200) {
				 bill = units*7; }
		 
			 else {
				 bill = units*10;
			 }
		 System.out.println("Total Electricity Bill  = RS" +bill);	 
		 }


//--------Write a program to check whether a number is positive and even.
	
		int num = 6;

        if(num > 0)
            System.out.println("Positive Number");
        else if(num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Number is negative or odd");
    }
		
		
		
		
//////---------------nested if else---------------------------------------------------------------------------------------
	
	
//---Write a program to check whether a person is eligible for a loan.---------
		
	
	
	 int age = 22;
     int salary = 30000;

     if(age >= 21 && salary >= 25000)
         System.out.println("Eligible for Loan");
     else
         System.out.println("Not Eligible for Loan");
 }
	
	
	
//------------------Write a program to check whether a year is a leap year.-------
		  int year = 2024;

	        if(year % 4 == 0)
	            System.out.println("Leap Year");
	        else
	            System.out.println("Not a Leap Year");
	    }
	

		
//------------Write a program to check login authentication (username and password).------------------
		
		String username = "admin";
        String password = "12345";

        if(username.equals("admin") && password.equals("1234"))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Username or Password");
    }
    	*/
		
		
//----------Write a program to check whether a number is divisible by both 3 and 5.---------
		
		 int num = 15;

	        if(num % 3 == 0 && num % 5 == 0)
	            System.out.println("Number is divisible by 3 and 5");
	        else
	            System.out.println("Number is not divisible by 3 and 5");
	    }
	}
