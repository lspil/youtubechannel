package invoicing.model;

public class Invoice {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "amount=" + amount +
                '}';
    }
}
