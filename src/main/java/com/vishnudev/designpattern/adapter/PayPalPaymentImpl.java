package com.vishnudev.designpattern.adapter;

public class PayPalPaymentImpl implements PayPalPayment {

    @Override
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}
