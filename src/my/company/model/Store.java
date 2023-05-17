package my.company.model;

import my.company.service.PaymentService;
import my.company.service.impl.CashPaymentService;
import my.company.service.impl.SBPPaymentService;
import my.company.service.impl.StripePaymentService;

import java.util.Objects;

public class Store {

    private final PaymentService stripePaymentService;

    private final PaymentService sbpPaymentService;

    private final PaymentService cashPaymentService;

    public Store() {
        this.stripePaymentService = new StripePaymentService();
        this.sbpPaymentService = new SBPPaymentService();
        this.cashPaymentService = new CashPaymentService();
    }

    public void sellItem(PaymentMethod paymentMethod) {
        switch (paymentMethod) {
            case Stripe -> stripePaymentService.processPayment();
            case SBP -> sbpPaymentService.processPayment();
            case Cash -> cashPaymentService.processPayment();
            default -> System.out.println("Unknown payment method");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Store store = (Store) o;

        if (!Objects.equals(stripePaymentService, store.stripePaymentService))
            return false;
        if (!Objects.equals(sbpPaymentService, store.sbpPaymentService))
            return false;
        return Objects.equals(cashPaymentService, store.cashPaymentService);
    }

    @Override
    public int hashCode() {
        int result = stripePaymentService.hashCode();
        result = 31 * result + sbpPaymentService.hashCode();
        result = 31 * result + cashPaymentService.hashCode();
        return result;
    }
}
