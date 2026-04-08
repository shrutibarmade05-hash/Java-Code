package com.am;

public class EmailNotification implements Notification {

	@Override
	public void sendMessage() {
		System.out.println("Notification through via Email");
		
	}

}
