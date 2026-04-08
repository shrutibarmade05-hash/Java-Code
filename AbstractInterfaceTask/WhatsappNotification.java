package com.AbstractInterfaceTask;

public class WhatsappNotification implements Notification {
	@Override
	public void sendMessage() {
		System.out.println("Notification through via WhatsApp");
		
	}
}
