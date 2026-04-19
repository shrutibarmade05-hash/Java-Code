package com.String_Builder;

//Convert String to StringBuilder and modify it.------

public class StringToStringBuilder {
	public static void main(String args[]) {
	String str = "Shruti";
	
	StringBuilder s = new StringBuilder(str);
	s.append(" Barmade");
	s.insert(6 , " Shripad");
	System.out.println(s);
	}
}
