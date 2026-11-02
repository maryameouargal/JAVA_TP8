package com.tp8.payment;

public class BankTransferProcessor implements PaymentProcessor {
	private final String accountNumber;

//	the constructor using sources

	public BankTransferProcessor(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	// and again the methode from the i that we should redefined
	public boolean processPayment(double amount) {
		if (amount <= 0) {
			System.out.println("Virement is not possible : the montant is not valid .");
			return false;
		}
		System.out.println("Virement of " + amount + " dh too " + accountNumber + " still in process...");

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return false;
		}

		System.out.println("Virement is done .");
		return true;
	}

	public String getPaymentMethod() {
		return "Virement Bancaire";
	}
}
