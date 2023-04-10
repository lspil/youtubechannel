package com.example.ssm_2023_e2.repositories;

import com.example.ssm_2023_e2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

  @Query("""
    SELECT u FROM User u WHERE u.username = :username
    """)
  Optional<User> findByUsername(String username);
}
