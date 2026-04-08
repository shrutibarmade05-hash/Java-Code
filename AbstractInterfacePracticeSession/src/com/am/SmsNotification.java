package com.am;

public class SmsNotification implements Notification{
	@Override
	public void sendMessage() {
		System.out.println("Notification through via SMS");
		
	}
}
