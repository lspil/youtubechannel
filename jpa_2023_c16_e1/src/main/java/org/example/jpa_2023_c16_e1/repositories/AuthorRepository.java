package org.example.jpa_2023_c16_e1.repositories;

import org.example.jpa_2023_c16_e1.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query("""
        SELECT a FROM Author a WHERE a.id = :id
    """)
    Optional<Author> findAuthorById(Integer id);
//
//    @Query("""
//        SELECT a FROM Author a
//    """)
//    List<Author> findALlAuthors();
}
