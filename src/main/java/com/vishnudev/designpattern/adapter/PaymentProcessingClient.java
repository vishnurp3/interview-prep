package com.vishnudev.designpattern.adapter;

public class PaymentProcessingClient {

    public static void main(String[] args) {
        PayPalPayment payPalPayment = new PayPalPaymentImpl();
        StripePayment stripePayment = new StripePaymentImpl();

        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalPayment);
        PaymentProcessor stripeProcessor = new StripeAdaptor(stripePayment);

        double amount = 100.0;
        payPalProcessor.processPayment(amount);
        stripeProcessor.processPayment(amount);
    }
}
