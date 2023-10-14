package org.example.dto;

import org.example.entities.Enrollment;
import org.example.entities.Student;

public record EnrolledStudent(
        Student student,
        Enrollment enrollment
) {
}
