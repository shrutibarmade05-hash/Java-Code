package com.sb;

public class bitwiseoperator {

	public static void main(String args[]) {
		
		  System.out.println(Integer.toBinaryString(46));   
		  System.out.println(Integer.toBinaryString(3));   
		  System.out.println(Integer.toBinaryString(8));   
		  
		  //AND
		  int a = 46;
		  int b = 3;
		  System.out.println(a&b);
		  
		  //OR
		  int p = 26;
		  int q = 8;
		  System.out.println(p|q);
		  
		  //XOR
		  int w = 36;
		  int v = 2;
		  System.out.println(w^v);
		  
		  //Compliment
		  int x = -2;
        System.out.println(~-2);
        System.out.println(~41);
       
        
        //left shift 
        int m = 40;
        int n = 3;
        System.out.println(m<<n);
        
        //right shift
        int c= 65;
        int d = 1;
        System.out.println(c>>d);
        
		  
		  

		  
	}

}
 
