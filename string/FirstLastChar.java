package com.string;

public class FirstLastChar {
public static void main(String args[]) {
	String str = "Shruti Barmade";
	
	char first = str.charAt(0);
	  char last = str.charAt(str.length() - 1);

      System.out.println("First character: " + first);
      System.out.println("Last character: " + last);
}
}
