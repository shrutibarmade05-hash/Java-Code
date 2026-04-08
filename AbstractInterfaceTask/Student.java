package com.AbstractInterfaceTask;

public class Student extends Person implements Attendable{

	@Override
	
	

    public void markAttendance() {
        System.out.println("Student " + name + " marked present.");
    }
	

	@Override
	public void getDetails() {
			   System.out.println("Student Name = Shruti " + ", Roll No= 20 ");
	}

}
