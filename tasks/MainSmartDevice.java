package com.tasks;

public class MainSmartDevice {
	public static void main(String[] args) {

        SmartDevice device = new SmartFan();
        device.turnOn();
        device.turnOff();

        System.out.println("-------------------");

        device = new SmartLight();
        device.turnOn();
        device.turnOff();
    }
}
