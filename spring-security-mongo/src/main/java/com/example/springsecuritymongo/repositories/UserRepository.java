package com.example.springsecuritymongo.repositories;

import com.example.springsecuritymongo.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findUserByUsername(String username);
}
