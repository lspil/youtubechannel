package org.example;

import jakarta.persistence.*;
import org.example.entities.DistinctStudent;
import org.example.entities.Student;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

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

            // SELECT s FROM Student s  ->> JPQL
//            String sql = """
//                    SELECT * FROM student
//                    """;
//
//            Query q = em.createNativeQuery(sql, Student.class);
//
//            q.getResultList().forEach(
//                    s -> System.out.println(s)
//            );

//            String sql = "SELECT s FROM DistinctStudent s";
//            TypedQuery<DistinctStudent> q = em.createQuery(sql, DistinctStudent.class);
//            q.getResultList().forEach(s -> System.out.println(s));

            StoredProcedureQuery q = em.createStoredProcedureQuery("GetStudents", Student.class)
                            .registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN)
                                    .setParameter("id", 2);

            q.getResultList().forEach(s -> System.out.println(s));

            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }
}