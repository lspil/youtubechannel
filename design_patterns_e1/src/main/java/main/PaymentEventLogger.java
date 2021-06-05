package main;

import java.util.Objects;

public class PaymentEventLogger implements PaymentListener {

    private final String id;

    public PaymentEventLogger(String id) {
        this.id = id;
    }

    @Override
    public void paymentMade(PaymentEvent e) {
        logEvent();
    }

    private void logEvent() {
        System.out.println("Payment received");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentEventLogger that = (PaymentEventLogger) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
