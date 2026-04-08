package com.abstraclass;

public class MiniRide extends Ride {

	@Override
	public void calculateFare(double distance) {
		 double fare = distance * 6; 
		 System.out.println("Prime Ride Fare="+fare);
		
	}
	

}
