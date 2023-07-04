package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

//    @ManyToMany()
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn
    @JoinTable(
            name = "professor_student",
            joinColumns = @JoinColumn(name = "professor"),
            inverseJoinColumns = @JoinColumn(name = "student")
    )
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
