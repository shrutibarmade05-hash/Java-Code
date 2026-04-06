package com.task9;

public class Ac implements RemoteControl{

	@Override
	public void powerOn() {
		  System.out.println("AC is turned ON");
	}

	@Override
	public void powerOff() {
		 System.out.println("AC is turned OFF");
		
	}

}
