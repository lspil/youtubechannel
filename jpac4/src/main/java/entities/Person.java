package entities;

import javax.persistence.*;

@Entity
@Access(AccessType.PROPERTY)
public class Person {

    private int id; // FIELD ACCESS

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() { // PROPERTY ACCESS
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
