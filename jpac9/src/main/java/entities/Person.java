package entities;

import entities.enums.PhoneType;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ElementCollection
    @CollectionTable(name = "phone", joinColumns = @JoinColumn(name = "person"))
    @MapKeyColumn(name = "type")
    @Column(name = "number")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<PhoneType, String> phoneNumber;

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

    public Map<PhoneType, String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Map<PhoneType, String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
