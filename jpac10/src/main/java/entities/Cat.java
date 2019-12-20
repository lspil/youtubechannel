package entities;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
