package com.example.ss_2022_c17_e1_rs.config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationManagerResolver;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationProvider;
import org.springframework.security.oauth2.server.resource.authentication.JwtIssuerAuthenticationManagerResolver;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.oauth2ResourceServer(
        j -> j.authenticationManagerResolver(authenticationManagerResolver())
    );

    return http.build();
  }

  @Bean
  public AuthenticationManagerResolver<HttpServletRequest> authenticationManagerResolver() {
    JwtIssuerAuthenticationManagerResolver a =
        new JwtIssuerAuthenticationManagerResolver("http://localhost:7070", "http://localhost:8080");

    return a;
  }


}
