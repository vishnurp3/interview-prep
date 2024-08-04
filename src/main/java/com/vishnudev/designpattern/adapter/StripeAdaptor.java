package com.vishnudev.designpattern.adapter;

public class StripeAdaptor implements PaymentProcessor {

    private final StripePayment stripePayment;

    public StripeAdaptor(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void processPayment(double amount) {
        stripePayment.makePayment(amount);
    }
}
