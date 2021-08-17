package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="chocolate")
public class Chocolate extends Product {

    private int kCal;

    public int getkCal() {
        return kCal;
    }

    public void setkCal(int kCal) {
        this.kCal = kCal;
    }
}
