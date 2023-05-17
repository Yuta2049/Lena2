package my.company.service.impl;

import my.company.service.PaymentService;

public class CashPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Cash payment");
    }
}
