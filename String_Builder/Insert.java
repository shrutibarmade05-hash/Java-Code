package com.String_Builder;

//Create a StringBuilder and insert the word "Java" in the middle of a sentence.-------------------

public class Insert {
public static void main(String args[]) {
	StringBuilder s = new StringBuilder("Hello world");
	s.insert(6, "java ");
	System.out.println(s);
}
}
