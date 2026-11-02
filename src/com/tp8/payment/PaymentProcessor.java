package com.tp8.payment;

public interface PaymentProcessor {

	// the attributes of the interface
	boolean processPayment(double amount);

	String getPaymentMethod();

}
