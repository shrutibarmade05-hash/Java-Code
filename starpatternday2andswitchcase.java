package star.com;

public class starpatternday2andswitchcase {
public static void main(String args[]) {
/*	A
	AB
	ABC
	ABCD
	ABCDE     
	
	for(int i =1; i<=5;i++) {
		for(char ch='A'; ch<'A'+i; ch++) {
			System.out.print(ch);
		}
			System.out.println();
	}
	
------------------------------------------------------------------------------------------------------	
	
*
**
***
****
*****
****
***
**
*
	

	int n = 5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();
	}
	
	for(int i = 5-1; i >= 1; i--) {
        for(int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
}

----------------------------------------------------------------------------------------------------------

1
01
101
0101
10101
	

	for(int i=1;i<=5;i++) {
		int num = (i % 2 == 0) ? 0 : 1;
        for(int j = 1; j <= i; j++) {
            System.out.print(num);
            num = 1 - num;
        }
        System.out.println();
   
		}
	}
	
---------------------------------using switch case-------------------------------------------------------------------------
	 

5. Input a number (1â€“5) and print:
1 â†’ Java
2 â†’ Python
3 â†’ C++
4 â†’ JavaScript
5 â†’ SQL

	
	int num =4;
	switch(num) {
	case 1:
		System.out.println("Java");
		break;
	case 2:
		System.out.println("Python");
		break;
		
	case 3:
		System.out.println("C++");
		break;
	case 4:
		System.out.println("JavaScript");
		break;
	case 5:
		System.out.println("SQL");
		break;
		default:
			System.out.println("inavlid number");
	}
	

----------------------------------------------------------------------------------------------------------
6 .Create a program to calculate area:
1 â†’ Circle
2 â†’ Square
3 â†’ Rectangle 
	
	
	int num =2;
	switch(num) {
	case 1:
		System.out.println("Circlea");
		break;
	case 2:
		System.out.println("Square");
		break;
		
	case 3:
		System.out.println("Rectangle");
		break;
	default:
		System.out.println("inavlid number");
}
	
-----------------------------------------------------------------------------------------------------------	

7 . Input a number (1â€“3) and print:
1 â†’ "Login Success"
2 â†’ "Invalid Password"
3 â†’ "Account Locked"
*/		
	
	int num =1;
	switch(num) {
	case 1:
		System.out.println("Login Success");
		break;
	case 2:
		System.out.println("Invalid Password");
		break;
		
	case 3:
		System.out.println("Account Locked");
		break;
	default:
		System.out.println("inavlid number");
}
	
	
	
	
	
	
}

	
}
