package com.task8;

public class WhatsAppNotification  implements Notificatin {
	public void sendMessage(String msg) {
        System.out.println("WhatsApp message sent: " + msg);
    }
}
