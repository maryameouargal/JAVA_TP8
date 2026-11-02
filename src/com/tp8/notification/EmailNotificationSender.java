package com.tp8.notification;

public class EmailNotificationSender implements NotificationSender {

//	the methodes that are in i and should be redefined 
	public void sendNotification(String recipient, String message) {
		if (recipient == null || !recipient.contains("@")) {
			System.out.println("[MAIL] Adresse  is refused: " + recipient);
			return;
		}
		System.out.println("[MAIL] sent to  " + recipient + " -> " + message);
	}

	public String getChannelType() {
		return "Email";
	}
}
