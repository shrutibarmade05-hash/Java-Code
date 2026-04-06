package com.task8;

public class SmsNotification  implements Notificatin {
	  public void sendMessage(String msg) {
	        System.out.println("SMS sent: " + msg);
	    }
}
