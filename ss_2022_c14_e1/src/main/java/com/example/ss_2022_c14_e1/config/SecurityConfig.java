package com.example.ss_2022_c14_e1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Value("${jwksUri}")
  private String jwksUri;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.oauth2ResourceServer(
        r -> r.jwt().jwkSetUri(jwksUri)
            .jwtAuthenticationConverter(new CustomJwtAuthenticationTokenConverter())
    );

    http.authorizeHttpRequests().anyRequest().authenticated();
    return http.build();
  }
}
