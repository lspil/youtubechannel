package com.example.ssm_2023_e2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.httpBasic();

    http.authorizeHttpRequests()
        .requestMatchers("/user").permitAll()
        .requestMatchers(HttpMethod.GET,"/api/**").hasAuthority("read")
        .requestMatchers("/smth").access(new WebExpressionAuthorizationManager("isAuthenticated()"))
        .anyRequest().authenticated();

    http.csrf().ignoringRequestMatchers("/user");

    return http.build();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
