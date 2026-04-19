package com.String_Builder;

//Delete characters from index 2 to 5 using StringBuilder.-----------------

public class Delete {
public static void main(String args[]) {
	StringBuilder s = new StringBuilder("welcome in kiran academy");
	s.delete(2, 5);
	System.out.println(s);
}
}
