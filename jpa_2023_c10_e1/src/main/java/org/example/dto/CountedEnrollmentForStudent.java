package org.example.dto;

import org.example.entities.Student;

public record CountedEnrollmentForStudent(
        Student s,
        Long count
) {
}
