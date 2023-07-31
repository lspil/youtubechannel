package org.example.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import org.example.entities.keys.StudentKey;

@Entity
public class Student {

    @EmbeddedId
    private StudentKey id;

    private String name;

    public StudentKey getId() {
        return id;
    }

    public void setId(StudentKey id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
