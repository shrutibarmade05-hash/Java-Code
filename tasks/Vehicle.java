package com.tasks;

public abstract class Vehicle {
/*Vehicle Service System
Create abstract class Vehicle with:
abstract method startEngine()
concrete method stopEngine()
Subclasses:
Car
Bike

*/
	public abstract void startEngine();
	
	public void stopEngine(){
		System.out.println("Engine stopped successfully!");
	}
	
	
}
