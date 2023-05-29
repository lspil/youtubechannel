package com.example.oauth2_marathon_e1.services;

import com.example.oauth2_marathon_e1.entities.*;
import com.example.oauth2_marathon_e1.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class ClientService implements RegisteredClientRepository {

  private final ClientRepository clientRepository;

  @Override
  @Transactional
  public void save(RegisteredClient registeredClient) {
    Client c = new Client();

    c.setClientId(registeredClient.getClientId());
    c.setSecret(registeredClient.getClientSecret());
    c.setAuthenticationMethods(
        registeredClient.getClientAuthenticationMethods()
            .stream().map(a -> AuthenticationMethod.from(a, c))
            .collect(Collectors.toList())
    );
    c.setGrantTypes(
        registeredClient.getAuthorizationGrantTypes()
            .stream().map(g -> GrantType.from(g, c))
            .collect(Collectors.toList())
    );
    c.setRedirectUrls(
        registeredClient.getRedirectUris()
            .stream().map(u -> RedirectUrl.from(u, c))
            .collect(Collectors.toList())
    );
    c.setScopes(
        registeredClient.getScopes()
            .stream().map(s -> Scope.from(s, c))
            .collect(Collectors.toList())
    );

    clientRepository.save(c);
  }

  @Override
  public RegisteredClient findById(String id) {
    var client = clientRepository.findById(Integer.parseInt(id));

    return client.map(Client::fromClient)
            .orElseThrow(() -> new RuntimeException(":("));
  }

  @Override
  public RegisteredClient findByClientId(String clientId) {
    var client = clientRepository.findByClientId(clientId);

    return client.map(Client::fromClient)
        .orElseThrow(() -> new RuntimeException(":("));
  }
}
