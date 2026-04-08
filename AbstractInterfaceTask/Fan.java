package com.AbstractInterfaceTask;

public class Fan implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("Fan is Turned on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Fan is Turned off");
		
	}

}
