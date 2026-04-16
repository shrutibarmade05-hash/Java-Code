package com.String;

public class Palindrome {
public static void main(String args[]) {
	/*Check Palindrome String
Input: "madam"
Output: "Palindrome"
(Use if-else and loop)
*/
	String str = "madam";
	String rev = "";
	
	for(int i = str.length()-1 ; i>=0 ; i--) {
	 rev = rev+str.charAt(i);
	}
	
  if(str.equals(rev)){
	System.out.println("Palindrome");
	
   }else {
	System.out.println("Not Palindrome");
}
	
}
}
