package com.example.ss_2022_c3_e1.config;

import com.example.ss_2022_c3_e1.config.security.filters.CustomAuthenticationFilter;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@AllArgsConstructor
public class SecurityConfig {

  private final CustomAuthenticationFilter customAuthenticationFilter;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
        .addFilterAt(customAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
        .authorizeRequests().anyRequest().authenticated()  // don't worry about this
        .and().build();
  }
}
