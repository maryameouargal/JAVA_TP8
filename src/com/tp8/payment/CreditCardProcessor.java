package com.tp8.payment;

public class CreditCardProcessor implements PaymentProcessor {
	private final String cardNumber;

	// the constructor using source

	public CreditCardProcessor(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	// the methode from the i that we should redefined
	public boolean processPayment(double amount) {
		if (cardNumber == null || cardNumber.isEmpty()) {
			System.out.println("you need card , you can't PAY.");
			return false;
		}
		if (amount <= 0) {
			System.out.println("this Montant  is refused: " + amount + " dh.");
			return false;
		}
		System.out.println("Card " + cardNumber + " debit with " + amount + " dh.");
		return true;
	}

	public String getPaymentMethod() {
		return "Carte Bancaire";
	}

}
