package entities;

import javax.persistence.Entity;

@Entity
public class Chocolate extends Product {

    private int kCal;

    public int getkCal() {
        return kCal;
    }

    public void setkCal(int kCal) {
        this.kCal = kCal;
    }
}
