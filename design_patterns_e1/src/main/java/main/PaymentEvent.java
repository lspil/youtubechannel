package main;

public class PaymentEvent {

    // any detail
    private final PaymentSubject paymentSubject;

    public PaymentEvent(PaymentSubject paymentSubject) {
        this.paymentSubject = paymentSubject;
    }

    public PaymentSubject getPaymentSubject() {
        return paymentSubject;
    }
}
