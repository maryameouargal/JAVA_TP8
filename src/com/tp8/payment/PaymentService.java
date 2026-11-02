package com.tp8.payment;

public class PaymentService {
	  private final PaymentProcessor processor;

	  // the constructor using source
	  
	  public PaymentService(PaymentProcessor processor) {
		this.processor = processor;
		
		
	  }
	  
//	  the methode that we have for this class
	    public boolean pay(double amount) {
	        System.out.println("the way used : " + processor.getPaymentMethod());

	        boolean ok = processor.processPayment(amount);

	        if (ok) {
	            System.out.println("Paiement is accepted.");
	        } else {
	            System.out.println("Paiement is refused.");
	        }
	        return ok;
	    }	  
}
