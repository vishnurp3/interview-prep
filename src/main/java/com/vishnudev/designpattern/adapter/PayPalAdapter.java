package com.vishnudev.designpattern.adapter;

public class PayPalAdapter implements PaymentProcessor {

    private final PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(double amount) {
        payPalPayment.sendPayment(amount);
    }
}
