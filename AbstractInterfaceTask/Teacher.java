package com.AbstractInterfaceTask;

public class Teacher  extends Person implements Attendable {

	@Override
	public void markAttendance() {
		  System.out.println("Teacher Name : Shru" + ", Subject: math" );
		
	}

	@Override
	public void getDetails() {
		   System.out.println("Teacher Name  = Shru " + " marked present.");
		
	}

}
