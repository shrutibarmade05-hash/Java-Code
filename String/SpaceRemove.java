package com.String;

public class SpaceRemove {
/*
Remove All Spaces from String
Input: "Java is powerful"
Output: "Javaispowerful"
(Without using replace() method)
*/
	
	    public static void main(String[] args) {

	        String str = "Java is powerful";
	        String result = "";

	        for(int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if(ch != ' ') {
	                result = result + ch;
	            }
	        }

	        System.out.println(result);
	    }
	}
	
	