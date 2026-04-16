
	
/*Count Uppercase and Lowercase Characters
Input: "JavaTrainer"
Output: Uppercase = ?, Lowercase = ?
Check String is Empty or Not
If string is empty → print "String is empty"
Else → print "String is not empty"

*/



package com.String;

public class LowercaseUppercaee {

    public static void main(String args[]) {

        String str = "JavaTrainer";

        int lowercase = 0;
        int uppercase = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                uppercase++;
            else
                lowercase++;
        }

        System.out.println("Uppercase = " + uppercase);
        System.out.println("Lowercase = " + lowercase);

        if(str.isEmpty())
            System.out.println("String is empty");
        else
            System.out.println("String is not empty");
    }
}