package com.example.ss_2022_c18_e1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests()
        .anyRequest().permitAll();

//    http.csrf().disable();  // DON'T DO THAT!
//    http.csrf().ignoringRequestMatchers("/smth");

    return http.build();
  }

}
