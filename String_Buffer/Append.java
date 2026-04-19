package com.String_Buffer;


public class Append {
public static void main(String args[]) {
	
	/*
 //Create a StringBuffer and append your name.--------------


	StringBuffer s = new StringBuffer("Hello");
	s.append("Shruti");
	System.out.println(s);
	*/
	
	
	
//Insert "Programming" inside "I Love " using StringBuffer.--------------
	
/*	 StringBuffer sb = new StringBuffer("I Love ");

     sb.insert(7, "Programming");

     System.out.println(sb);  */
	
	
	
//Reverse a string using StringBuffer.------------------------------
	
/*	StringBuffer s = new StringBuffer("Shruti");
	s.reverse();
	System.out.println(s);
	*/
	
	
	
//Delete last 3 characters using StringBuffer.-------------
	
/*	StringBuffer s = new StringBuffer("ShrutiBarmade");
	 s.delete(s.length() - 3, s.length());

     System.out.println(s);  
     */
	
	
	
//Replace "India" with "Bharat" using StringBuffer.---------------

	/*StringBuffer s = new StringBuffer("India");
	System.out.println(s.replace(0, 5, "Bharat"));
	*/
	
	
//Print length and capacity of StringBuffer.----------------
	
	/*StringBuffer s = new StringBuffer("Shruti Barmade");
	
    System.out.println(s.length());
    System.out.println(s.capacity());
    */
	
	

//Convert StringBuffer to String.-------------------------------
	
	StringBuffer s = new StringBuffer("Hello Java");
	 String str = s.toString();

     System.out.println(str);
}
}
