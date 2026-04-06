package com.task3;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car is Starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
		
	}

}
