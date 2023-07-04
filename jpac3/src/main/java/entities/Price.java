package entities;

import entities.enums.Currency;

import javax.persistence.*;

@Entity
@Table(name="price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;

    //@Enumerated(EnumType.ORDINAL)			// default
    @Enumerated(EnumType.STRING)
    private Currency currency;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
