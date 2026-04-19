package com.string;

//Check whether a string contains the word "Java". ----------

public class ContainsExample {

	public static void main(String args[]) {
		String str = " I am learning java programming";
		
		if(str.contains("java")) {
			System.out.println("String contains java");
		}else {
			System.out.println("String does not contains java");
		}
		}
}
