package com.example.oauth2_marathon_e1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.settings.OAuth2TokenFormat;
import org.springframework.security.oauth2.server.authorization.settings.TokenSettings;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "client_id")
  private String clientId;

  private String secret;

  @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
  private List<AuthenticationMethod> authenticationMethods;

  @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
  private List<GrantType> grantTypes;

  @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
  private List<RedirectUrl> redirectUrls;

  @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
  private List<Scope> scopes;

  @OneToOne(mappedBy = "client")
  private ClientTokenSettings clientTokenSettings;

  public static RegisteredClient fromClient(Client client) {
    return RegisteredClient.withId(String.valueOf(client.getId()))
        .clientId(client.getClientId())
        .clientSecret(client.getSecret())
        .clientAuthenticationMethods(clientAuthenticationMethods(client.getAuthenticationMethods()))
        .authorizationGrantTypes(authorizationGrantTypes(client.getGrantTypes()))
        .scopes(scopes(client.getScopes()))
        .redirectUris(redirectUris(client.getRedirectUrls()))
        .tokenSettings(TokenSettings.builder()
            .accessTokenTimeToLive(Duration.ofHours(client.clientTokenSettings.getAccessTokenTTL()))
            .accessTokenFormat( new OAuth2TokenFormat(client.clientTokenSettings.getType()))
            .build())
        .build();
  }

  private static Consumer<Set<AuthorizationGrantType>> authorizationGrantTypes(List<GrantType> grantTypes) {
    return s -> {
      for (GrantType g: grantTypes) {
        s.add(new AuthorizationGrantType(g.getGrantType()));
      }
    };
  }

  private static Consumer<Set<ClientAuthenticationMethod>> clientAuthenticationMethods(
      List<AuthenticationMethod> authenticationMethods) {
    return m -> {
      for (AuthenticationMethod a : authenticationMethods) {
        m.add(new ClientAuthenticationMethod(a.getAuthenticationMethod()));
      }
    };
  }

  private static Consumer<Set<String>> scopes(List<Scope> scopes) {
    return s -> {
      for (Scope x : scopes) {
        s.add(x.getScope());
      }
    };
  }

  private static Consumer<Set<String>> redirectUris(List<RedirectUrl> uris) {
    return r -> {
      for (RedirectUrl u : uris) {
        r.add(u.getUrl());
      }
    };
  }
}
