package com.vishnudev.designpattern.adapter;

public class StripePaymentImpl implements StripePayment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
