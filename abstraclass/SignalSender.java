package com.abstraclass;

public class SignalSender extends MessageSender{
	  @Override
	    public void sendMessage() {
	        System.out.println("Message sent via Signal Sender!");
	    }
}
