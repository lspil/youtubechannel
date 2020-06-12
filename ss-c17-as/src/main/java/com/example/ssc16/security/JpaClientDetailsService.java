package com.example.ssc16.security;

import com.example.ssc16.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

public class JpaClientDetailsService
        implements ClientDetailsService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientDetails loadClientByClientId(String clientId) {
        return clientRepository.findClientByClientId(clientId)
                .map(c -> new SecurityClient(c))
                .orElseThrow(() -> new ClientRegistrationException(":("));
    }
}
