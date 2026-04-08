package com.abstraclass;

public abstract class Hospital {
/*Hospital Management
Create abstract class MedicalStaff with:
abstract method performDuty()
concrete method getStaffDetails()
Subclasses:
Doctor
Nurse
*/
	
	  public abstract void performDuty();
	  
	  public void getStaffDetails() {
	        System.out.println("Staff Details:");
	        System.out.println("Name: Shruti");
	        System.out.println("ID: 202");
	    }
}
