package com.task8;

public class Main {
	 public static void main(String[] args) {
	        Notificatin email = new EmailNotification ();
	        email.sendMessage("Hello via Email!");

	        Notificatin sms = new SmsNotification();
	        sms.sendMessage("Hello via SMS!");

	        Notificatin whatsapp = new WhatsAppNotification();
	        whatsapp.sendMessage("Hello via WhatsApp!");
	    }
}
