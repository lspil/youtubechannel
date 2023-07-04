package entities;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "department")
    @MapKey(name = "id")						// the id is put as the key of the map
    private Map<Integer, Employee> employees;

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

    public Map<Integer, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<Integer, Employee> employees) {
        this.employees = employees;
    }
}
