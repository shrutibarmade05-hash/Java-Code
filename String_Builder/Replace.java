package com.String_Builder;

//Replace the word "Java" with "Python" using StringBuilder.-----------------------

public class Replace {
public static void main(String args[]) {
	StringBuilder s = new StringBuilder("Java");
	s.replace(0, 4,"Python");
	System.out.println(s);
}
}
