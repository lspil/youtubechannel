package com.example.ss_roles_authorities.repositories;

import com.example.ss_roles_authorities.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  @Query("""
    SELECT u FROM User u WHERE u.username = :username
  """)
  Optional<User> findUserByUsername(String username);
}
