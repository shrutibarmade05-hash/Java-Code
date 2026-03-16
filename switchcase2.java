package com.src;

public class switchcase2 {
	public static void main(String[] args) {

/*		//---1. Check Character Case
//   Write a Java program using switch case to check whether a character is:
//Uppercase
//Lowercase

		char ch = 'r';
		switch(ch) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		System.out.println("Uppercase");
		break;
		default:
			System.out.println("Lowercase");	
		}
	
	
	
//-------------2. Check Weekday or Weekend
Write a Java program using switch case to check whether the day number represents:
Weekday
Weekend

		
int num = 3;
switch(num) {
case 1:
case 2:
case 3:
case 4:
case 5:
	System.out.println("Weekday");
	break;
case 6:
case 7:
	System.out.println("Weekend");
	break;
default:
	System.out.println("Invalid");
}
	
	
	
	//-------3. Check Arithmetic Operation Name----------------

Write a Java program using switch case to print operation name.

Example:
1 → Addition
2 → Subtraction
3 → Multiplication
4 → Division
	
	
	
int num = 4;
switch(num) {
case 1:
	System.out.println("Addition");
	break;
case 2:
	System.out.println("Substraction");
	break;
case 3:
	System.out.println("Multiplication");
	break;
case 4:
	System.out.println("Division");
	break;
	default:
		System.out.println("invalid data");


		
		//------------4. Fruit Price Menu---------

Write a Java program using switch case to display price of fruits.

Example:
1 → Apple ₹100
2 → Mango ₹80
3 → Banana ₹40
4 → Orange ₹60


		int num = 4;
		switch(num) {
		case 1:
			System.out.println("apple"+" rs = 100");
			break;
		case 2:
			System.out.println("Mango"+" rs = 80");
			break;
		case 3:
			System.out.println("Banana"+" rs = 40");
			break;
		case 4:
			System.out.println("Orange"+" rs =  60");
			break;
			default:
				System.out.println("invalid");
}
	
	

//------------------5. Language Selection-----------

Write a Java program using switch case to display greeting message.

Example:
1 → English → Hello
2 → Hindi → Namaste
3 → Marathi → Namaskar	
		

		int num = 3;
		switch(num) {
		case 1:
			System.out.println("English-------->"+"Hello");
			break;
		case 2:
			System.out.println("Hindi------------>"+" Namaste");
			break;
		case 3:
			System.out.println("Marathi-------------->"+" Namaskar");
			break;
	default:
		System.out.println("Invalid");
		}
	}
	
	
	
	//------------------6. Student Result Status-----------

Write a Java program using switch case.

Input: Grade letter
A → Distinction
B → First Class
C → Second Class
D → Pass
F → Fail
	
	
char grade = 'A';
		
		switch(grade){
	case 'A' :
		System.out.println("Distinction");
		break;
		
	case 'B' :
		System.out.println("First Class");
		break;
		
	case 'C':
		System.out.println("Second Class");
		break;
		
	case 'D':
		System.out.println("Pass");
		break;
	
	case 'F':
		System.out.println("Fail");
		break;
	
     default:
			System.out.println("Invalid data");
}


	
	//--------------7. Season Based on Month------------

Write a Java program using switch case to print season.

Example:
Dec–Feb → Winter
Mar–May → Summer
Jun–Sep → Monsoon
Oct–Nov → Autumn

		int month= 7;
		switch(month) {
		case 12:
		case 1:	
		case 2:
			System.out.println("Winter"); break;
			
		case 3:	
		case 4:	
		case 5:	
			System.out.println("Summer"); break;
			
		case 6:	
		case 7:	
		case 8:	
			System.out.println("Mansoon"); break;
			
		case 9:	
		case 10:	
		case 11:	
			System.out.println("Autumn"); break;
			
		default:
			System.out.println("Invalid data");
		}



//-----------	8. ATM Menu---------------

Write a Java program using switch case.

1 → Check Balance
2 → Withdraw Money
3 → Deposit Money
4 → Exit

	
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("Check Balance");
			break;
		case 2:
			System.out.println("Withdraw Money");
			break;
		case 3:
			System.out.println("Deposit Money");
			break;
		case 4:
			System.out.println(" Exit");
			break;
			default:
				System.out.println("invalid data");
		}
		
		
	
	//-----------------9. Simple Food Menu----------------

Write a Java program using switch case.

1 → Pizza
2 → Burger
3 → Sandwich
4 → Pasta
Print the selected food.
	

		int num = 3;
		switch(num) {
		case 1:
			System.out.println(" Pizza");
			break;
		case 2:
			System.out.println("Burger");
			break;
		case 3:
			System.out.println("Sandwich");
			break;
		case 4:
			System.out.println(" Pasta");
			break;
			default:
				System.out.println("invalid data");
		}
	
	
	//---------------------	10. Check Digit Name------------------

		Write a Java program using switch case to display digit name.

		Example:
		0 → Zero
		1 → One
		2 → Two
		…
		9 → Nine
		
	
		int num = 7;
		switch(num) {
		case 0:
			System.out.println(" Zero");
			break;
		case 1:
			System.out.println("	One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println(" Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println(" Eight");
			break;
		case 9:
			System.out.println(" Nine");
			break;
			default:
				System.out.println("invalid data");
		}
	
	

	//-------------11. Area of Shapes---------------------

Write a Java program using switch case.

1 → Square
2 → Circle
3 → Rectangle

Calculate area based on choice.
	
	
		int num = 3;
		switch(num) {
		case 1:
			System.out.println("Square");
			break;
		case 2:
			System.out.println("Circle");
			break;
		case 3:
			System.out.println("Rectangle");
			break;
		
			default:
				System.out.println("invalid data");
		}
		
		
		//--------------12. Check Number Range---------------
Write a Java program using switch case.
Example:
Input: number / 10
0–3 → Low
4–7 → Medium
8–10 → High

	
		int month= 7;
		switch(month) {
		case 0:
		case 1:	
		case 2:
		case 3:	
			System.out.println("Low"); break;
			
		case 4:	
		case 5:
		case 6:	
		case 7:	
			System.out.println("Medium"); break;
			
		case 8:	
		case 9:	
		case 10:
			System.out.println("Mansoon"); break;
	
		default:
			System.out.println("Invalid data");
		}
		

	//--------------13. Company Department------------

Write a Java program using switch case.

1 → HR
2 → Finance
3 → IT
4 → Marketing

	
		int num = 3;
		switch(num) {
		case 1:
			System.out.println("HR");
			break;
		case 2:
			System.out.println(" Finance");
			break;
		case 3:
			System.out.println("IT");
			break;
		case 4:
			System.out.println(" Marketing");
			break;
			default:
				System.out.println("invalid data");
		}
	
	
	//-------------14. Vehicle Type---------------------

Write a Java program using switch case.

1 → Bike
2 → Car
3 → Bus
4 → Truck

Print vehicle type.
	
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("bike");
			break;
		case 2:
			System.out.println(" car");
			break;
		case 3:
			System.out.println("bus");
			break;
		case 4:
			System.out.println(" truck");
			break;
			default:
				System.out.println("invalid data");
		}
	
	
//---------------15. Check Password Strength Level-------------

Write a Java program using switch case.

Input level number:

1 → Weak Password
2 → Medium Password
3 → Strong Password

	
		int num = 2;
		switch(num) {
		case 1:
			System.out.println("Weak Password");
			break;
		case 2:
			System.out.println(" Medium Password");
			break;
		case 3:
			System.out.println("Strong Password");
			break;
			default:
				System.out.println("invalid data");
		}
		
		
	
	//----------------11. Print Language Name-------------

Input language code and print name.

1 → Java
2 → Python
3 → C++
4 → JavaScript
		
		int num = 2;
		switch(num) {
		case 1:
			System.out.println("Java");
			break;
		case 2:
			System.out.println(" Python");
			break;
		case 3:
			System.out.println("C++");
			break;
		case 4:
			System.out.println("JAVASCRIPT");
			break;
			default:
				System.out.println("invalid data");
		}
	
		
		//--------------Check character type.--------------

A-Z → Uppercase
a-z → Lowercase
0-9 → Digit
*/		
	
		char ch = 'M';
		switch(ch) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		System.out.println("Uppercase");
	    
		break;
		
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		System.out.println("Lowercase");
		break;
		
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("digit");
		break;
		default:
			System.out.println("invalid data");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}