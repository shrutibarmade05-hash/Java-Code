package com.String;

public class Vowels {
/*Count Vowels and Consonants
Input: "Education"
Output: Vowels = ?, Consonants = ?
(Use switch or if condition)*/
	
	
	public static void main(String args[]) {
		String str = "Education";
		int vowels;
		int constant;
		
		for(int i = 0 ; i<str.length() ; i++) {
			 char ch = str.charAt(i);
			 
			  switch(ch) {
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
              case 'A':
              case 'E':
              case 'I':
              case 'O':
              case 'U':
            	 
            	
        //    	  vowels++;
                  break;

              default:
                  if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      //          	  constant++;
                  }
          }
      }

  //    System.out.println("Vowels = " + vowels);
   //   System.out.println("Consonants = " +constant);
  }
}