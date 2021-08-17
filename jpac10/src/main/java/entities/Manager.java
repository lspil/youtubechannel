package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager extends Employee {

    private String responsibility;

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
}
