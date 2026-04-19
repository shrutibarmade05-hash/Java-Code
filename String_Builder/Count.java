package com.String_Builder;

//Count the number of characters using StringBuilder (without length()).---------------

public class Count {
	 public static void main(String args[]) {
	        StringBuilder sb = new StringBuilder("Hello Java");

	        int count = 0;

	        for (char c : sb.toString().toCharArray()) {
	            count++;
	        }

	        System.out.println(count);
	    }
}