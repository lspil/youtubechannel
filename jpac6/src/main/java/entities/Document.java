package entities;

import javax.persistence.*;

@Entity
@Table(name="document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    // a simple object
    //@ManyToOne
    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
//    @JoinColumn(name = "person")
    private Person person;

    public int getId() {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
