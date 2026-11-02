package com.tp8.notification;

public class NotificationService {

	private final NotificationSender sender;

// the constructor using source 

	public NotificationService(NotificationSender sender) {
		this.sender = sender;
	}

// the methode we have in this class 
	public void sendWelcomeMessage(String recipient) {
		String texte = "wellcome , ur account  is activeted .";
		System.out.println("Canal : " + sender.getChannelType());
		sender.sendNotification(recipient, texte);
	}
}
