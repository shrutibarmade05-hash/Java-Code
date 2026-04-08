package com.tasks;

public class MainSender {
	  public static void main(String[] args) {

	        MessageSender sender = new TelegramSender();
	        sender.sendMessage();

	       // sender = new WhatsappSender();
	      //  sender.sendMessage();

	        sender = new SignalSender();
	        sender.sendMessage();
}
}