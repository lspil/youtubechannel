package org.example;

import jakarta.persistence.*;
import org.example.dto.CountedEnrollmentForStudent;
import org.example.dto.EnrolledStudent;
import org.example.entities.Course;
import org.example.entities.Student;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {

    /**
     CREATE TABLE Student (
     id BIGINT PRIMARY KEY,
     name VARCHAR(255) NOT NULL
     );

     CREATE TABLE Course (
     id BIGINT PRIMARY KEY,
     title VARCHAR(255) NOT NULL
     );

     CREATE TABLE Enrollment (
     id BIGINT PRIMARY KEY,
     enrollmentDate DATE NOT NULL,
     student_id BIGINT REFERENCES Student(id),
     course_id BIGINT REFERENCES Course(id)
     );

     INSERT INTO Student (id, name) VALUES (1, 'Alice');
     INSERT INTO Student (id, name) VALUES (2, 'Bob');
     INSERT INTO Student (id, name) VALUES (3, 'Charlie');

     INSERT INTO Course (id, title) VALUES (1, 'Mathematics');
     INSERT INTO Course (id, title) VALUES (2, 'Physics');
     INSERT INTO Course (id, title) VALUES (3, 'Chemistry');

     -- Alice enrolls in Mathematics and Physics
     INSERT INTO Enrollment (id, enrollmentDate, student_id, course_id) VALUES (1, '2023-10-10', 1, 1);
     INSERT INTO Enrollment (id, enrollmentDate, student_id, course_id) VALUES (2, '2023-10-09', 1, 2);

     -- Bob enrolls in Physics
     INSERT INTO Enrollment (id, enrollmentDate, student_id, course_id) VALUES (3, '2023-09-15', 2, 2);

     -- Charlie enrolls in Chemistry
     INSERT INTO Enrollment (id, enrollmentDate, student_id, course_id) VALUES (4, '2023-08-20', 3, 3);
     */

    public static void main(String[] args) {
        String puName = "pu-name";

        Map<String, String> props = new HashMap<>();
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "none"); // create, none, update


        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(puName), props);

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

//            String jpql = """
//                    SELECT NEW org.example.dto.CountedEnrollmentForStudent(s.name, count(s))
//                    FROM Student s
//                    GROUP BY s.name
//                    HAVING s.name LIKE '%e'
//                    ORDER BY s.name DESC
//                    """;
//
//            TypedQuery<CountedEnrollmentForStudent> q =
//                    em.createQuery(jpql, CountedEnrollmentForStudent.class);

            TypedQuery<Student> q = em.createNamedQuery("getAllEnrolledStudents", Student.class);

            q.getResultList().forEach(o -> System.out.println(o));

            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }
}