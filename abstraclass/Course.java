package com.abstraclass;

public  abstract class Course {
/* Online Course Platform
Create abstract class Course with:
abstract method calculateDuration()
concrete method courseDetails()
Subclasses:
JavaCourse
PythonCourse*/
	
	public abstract void calculateDuration();
	
	public void courseDetails() {
		 System.out.println("Course Details:");
	        System.out.println("Instructor: Jane Doe");
	        System.out.println("Platform: EduTech");
	}
}
