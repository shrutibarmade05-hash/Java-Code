package com.String;

public class PrintCharacters {
/*Print Each Character in Separate Line
Input: "Core"
Output:
C
o
r
e
*/
	
	public static void main(String args[]) {
		String str = "Core";
		
		for(int i = 0 ; i<str.length() ; i++) {
			 System.out.println(str.charAt(i));
		}
	}
}
