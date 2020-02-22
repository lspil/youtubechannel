package com.laurentiuspilca.springsecurityc2.repositories;

import com.laurentiuspilca.springsecurityc2.entities.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository
        extends JpaRepository<User, Integer> {

    Optional<User> findUserByUsername(String username);
}
