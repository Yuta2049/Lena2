package my.company.service.impl;

import my.company.service.PaymentService;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Stripe payment");
    }
}
