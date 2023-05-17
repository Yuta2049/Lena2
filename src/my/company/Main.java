package my.company;

import my.company.model.PaymentMethod;
import my.company.model.Store;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        // sell with payment via Stripe
        store.sellItem(PaymentMethod.Stripe);

        // sell with payment via SBP
        store.sellItem(PaymentMethod.SBP);

        // sell for cash
        store.sellItem(PaymentMethod.Cash);
    }
}