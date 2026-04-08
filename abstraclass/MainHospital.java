package com.abstraclass;

public class MainHospital {
	 public static void main(String[] args) {

	        Hospital staff = new Doctor();
	        staff.getStaffDetails();
	        staff.performDuty();

	        System.out.println("-------------------");

	        staff = new Nurse();
	        staff.getStaffDetails();
	        staff.performDuty();
	    }
}
