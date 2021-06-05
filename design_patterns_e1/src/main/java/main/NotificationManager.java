package main;

public class NotificationManager implements PaymentListener {

    @Override
    public void paymentMade(PaymentEvent e) {
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Notification sent");
    }
}
