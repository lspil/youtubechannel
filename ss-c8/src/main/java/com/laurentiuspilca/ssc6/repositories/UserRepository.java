package com.laurentiuspilca.ssc6.repositories;

import com.laurentiuspilca.ssc6.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByUsername(String username);
}
