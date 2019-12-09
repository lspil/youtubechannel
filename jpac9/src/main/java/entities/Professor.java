package entities;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(name = "prof_stud",
            joinColumns = @JoinColumn(name = "prof"),
            inverseJoinColumns = @JoinColumn(name = "stud"))
    @MapKeyColumn(name = "course")
    private Map<String, Student> students;

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

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }
}
