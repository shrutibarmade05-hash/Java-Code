package com.AbstractInterfaceTask;

public class Light implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("Light is Turned on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Light is Turned off");
		
	}

}
