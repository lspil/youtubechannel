package com.example.oauth2_marathon_e1.repositories;

import com.example.oauth2_marathon_e1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  @Query("""
    SELECT u FROM User u WHERE u.username = :username
  """)
  Optional<User> findUserByUsername(String username);
}
