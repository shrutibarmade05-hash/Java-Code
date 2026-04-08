package com.am;

public class MainSmartDevice {
public static void main(String args[]) {
	SmartDevice s = new Light();
	s.turnOff();
	s.turnOn();
	System.out.println("------------------------------");
	s = new Fan();
	s.turnOff();
	s.turnOn();
}
}
