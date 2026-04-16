package com.String;
/*Count Number of Digits in String
Input: "Java1234"
Output: Digits = 4
Toggle Case of Each Character
Input: "JaVa"
Output: "jAvA"
(Upper → Lower, Lower → Upper)


*/

public class Digit {
public static void main(String args[]) {
	String str = "Java1234";
	
	int digits = 0;

    for(int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if(ch >= '0' && ch <= '9') {
            digits++;
        }
    }
    System.out.println("Digits = " + digits);
    
    
    
 // 2. Toggle case-------------------------------------------------------------------
    String str2 = "JaVa";
    String result = "";

    for(int i = 0; i < str2.length(); i++) {
        char ch = str2.charAt(i);

        if(ch >= 'A' && ch <= 'Z') {
            result = result + (char)(ch + 32);
        }
        else {
            result = result + (char)(ch - 32);
        }
    }

    System.out.println("Toggle = " + result);
}
}
