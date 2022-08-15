package com.example.two_big_problems_with_jpa.repositories;

import com.example.two_big_problems_with_jpa.entities.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

  @EntityGraph(type = EntityGraph.EntityGraphType.FETCH,
  attributePaths = {
      "classroom"
  })
  List<Student> findAll();

  @Query("""
    SELECT s FROM Student s LEFT JOIN FETCH s.classroom c
  """)
  List<Student> findAll2();
}
