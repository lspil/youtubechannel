package com.example.ssc32.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class ProjectConfig {

  @Bean
  public SecurityWebFilterChain securityWebFilterChain(
      ServerHttpSecurity http
  ) {
    return http.authorizeExchange()
              .anyExchange().authenticated()
        .and().oauth2ResourceServer()
          .jwt(
              jwtc -> jwtc.jwkSetUri("http://localhost:8080/auth/realms/master/protocol/openid-connect/certs")
          )
        .and().build();
  }
}
