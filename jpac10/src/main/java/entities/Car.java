package entities;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {

    private String gas;

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }
}
