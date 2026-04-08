package com.am;

public class MainNotification {
public static void main(String args[]) {
	//Notification n  = new EmailNotification();
//	n.sendMessage();
	
	Notification n = new SmsNotification();
	n.sendMessage();
	
	n = new WhatsappNotification();
	n.sendMessage();
}
}
