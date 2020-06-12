package com.example.ssc16.repositories;

import com.example.ssc16.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository
        extends JpaRepository<Client, Integer> {

    Optional<Client> findClientByClientId(String clientId);
}
