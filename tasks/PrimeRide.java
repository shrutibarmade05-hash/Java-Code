package com.tasks;

public class PrimeRide extends Ride {

	@Override
	public void calculateFare(double distance) {
		 double fare = distance * 8; 
		 System.out.println("Prime Ride Fare =" + fare);
		
	}

}
