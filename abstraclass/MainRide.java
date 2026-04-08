package com.abstraclass;

public class MainRide {
public static void main(String args[]) {
	 Ride r = new MiniRide();
	 r.calculateFare(4.6);
	 r.startRide();
	 r= new PrimeRide();
	 r.calculateFare(4);
	 r.startRide();
			 
}
}
