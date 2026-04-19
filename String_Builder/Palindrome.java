package com.String_Builder;

public class Palindrome {
public static void main(String args[]) {
	String str = "madam";
	
	StringBuilder s = new StringBuilder(str);
	String reversed = s.reverse().toString();
	
	if(str.equals(reversed)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}
