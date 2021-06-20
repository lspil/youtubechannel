package main;

@FunctionalInterface
public interface PaymentListener {

    void paymentMade(PaymentEvent e);
}
