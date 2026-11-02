package com.tp8.notification;

public class SmsNotificationSender implements NotificationSender {

	private static final int MAX_LENGTH = 160;

//	the methodes that are in i and should be redefined 

	public void sendNotification(String recipient, String message) {
		if (message != null && message.length() > MAX_LENGTH) {
			message = message.substring(0, MAX_LENGTH);
			System.out.println("SMS is too long , cut it to  " + MAX_LENGTH + " caracteres.");
		}
		System.out.println("SMS sent  to  " + recipient + " : " + message);
	}

	public String getChannelType() {
		return "SMS";
	}

}
