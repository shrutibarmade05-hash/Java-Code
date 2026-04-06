package com.task9;

public class Main {
	  public static void main(String[] args) {
	        RemoteControl tv = new Tv();
	        tv.powerOn();
	        tv.powerOff();

	        RemoteControl ac = new Ac();
	        ac.powerOn();
	        ac.powerOff();
	    }
}
