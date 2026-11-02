package com.tp8;

import com.tp8.payment.*;
import com.tp8.notification.*;

public class Main {
	public static void main(String[] args) {

		System.out.println(" Paiements");

		PaymentService p1 = new PaymentService(new CreditCardProcessor("4111-1111"));
		p1.pay(50.0);

		PaymentService p2 = new PaymentService(new BankTransferProcessor("MR76-3000"));
		p2.pay(150.0);

		// Test for errors
		p1.pay(-5.0);

		System.out.println("Notifications");

		NotificationService n1 = new NotificationService(new EmailNotificationSender());
		n1.sendWelcomeMessage("user@example.com");

		NotificationService n2 = new NotificationService(new SmsNotificationSender());
		n2.sendWelcomeMessage("066122222728");

		// Test for errors
		n1.sendWelcomeMessage("adresse-invalide");
	}
}
