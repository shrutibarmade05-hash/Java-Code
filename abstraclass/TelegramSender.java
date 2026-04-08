package com.abstraclass;

public class TelegramSender extends MessageSender{
	  @Override
	    public void sendMessage() {
	        System.out.println("Message sent via Telegram!");
	    }
}
