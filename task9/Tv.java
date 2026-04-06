package com.task9;

public class Tv implements RemoteControl {
	  public void powerOn() {
	        System.out.println("TV is turned ON");
	    }

	  @Override
	  public void powerOff() {
		  System.out.println("TV is turned OFF");
		
	  }

}
