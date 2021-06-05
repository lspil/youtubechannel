package main;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager implements PaymentSubject {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public void pay() {  // ---> Notify some payment listeners
        // do smth
        PaymentEvent e = new PaymentEvent(this);
       paymentListeners.forEach(p -> p.paymentMade(e)); // p -> p.paymentMade()
    }

    public void registerPaymentListener(PaymentListener p) {
        paymentListeners.add(p);
    }

    public void unregisterPaymentListener(PaymentListener p) {
        paymentListeners.remove(p);
    }

}
