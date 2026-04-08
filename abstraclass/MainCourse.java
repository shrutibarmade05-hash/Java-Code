package com.abstraclass;

public class MainCourse {
public static void main(String args[]) {
	System.out.println("Pyhton Course----------------------");
	
	Course c = new PythonCourse ();
	c.calculateDuration();
	c.courseDetails();
	
	System.out.println("-------java Course--------");
	
	c = new JavaCourse();
	c.calculateDuration();
	c.courseDetails();
	
}
}
