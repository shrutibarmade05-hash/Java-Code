package com.am;

public class WhatsappNotification implements Notification {
	@Override
	public void sendMessage() {
		System.out.println("Notification through via WhatsApp");
		
	}
}
