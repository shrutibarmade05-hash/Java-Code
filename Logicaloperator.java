package com.op;

public class Logicaloperator {

public static void main(String args[]) {
	boolean check = true;
	int a = 10;
	int b  = 14;
	
	
	
	System.out.println(a > b);
	System.out.println(10 < 14);

	System.out.println(14 >= 14); 
	System.out.println(14 <= 14);

	System.out.println(14 == 10);
	System.out.println(b > a);

	
	/*System.out.println(false||false);
	System.out.println(false||true);
	System.out.println(true||false);
	System.out.println(true||true);  */
	
	
	/*System.out.println(false&&false);
	System.out.println(false&&true);
	System.out.println(true&&false);
	System.out.println(true&&true);  */
	
	System.out.println(10>34 && 43!=43 || 67<=3);
	
	System.out.println(67<=600&& 40==43 || 74!=3);
	
	System.out.println(10>34 && (43!=43 || 67<=3)||97<=56);
	
	System.out.println((0 < 3) && (1 >= 0 || 2 <= 5) && 22 >= 90); // false
	
	System.out.println((10 == 9) || (1 >= 0 && 100 > 5) && 2 > 0); // true
	
	System.out.println((30 >= 29) && (20 > 19) || (1 >= 0 || 2 <= 5) && 22 >= 90); // false
	
	System.out.println(true || false); // true
	
	
	System.out.println(10 > 45 && 20 < 9 || check && true);  //true
	System.out.println((true) || 0 < 9 || check || 0 > 0);  //true
	System.out.println(1 > 5 || 2 < 9 || false && 0 == 0);   //true
	System.out.println(check && (20 < 9) || 45 != 0 && true);  //true
	
	
	
	
}
}
