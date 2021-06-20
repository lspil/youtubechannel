package main;

public class Main {

    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        paymentManager.registerPaymentListener(e -> {
            System.out.println(":)");
//            e.getPaymentSubject().unregisterPaymentListener(this);
        });

        PaymentListener p2 = new PaymentEventLogger("abcd");
        paymentManager.registerPaymentListener(p2);

        paymentManager.pay();

        paymentManager.unregisterPaymentListener(p2);

        paymentManager.pay();
    }
}
