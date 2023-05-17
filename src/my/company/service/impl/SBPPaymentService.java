package my.company.service.impl;

import my.company.service.PaymentService;

public class SBPPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("SBP Payment");
    }
}
