package com.example.ssm_2023_e3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.httpBasic();
    http.authorizeHttpRequests().anyRequest().authenticated();

    return http.build();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    var u1 = User.withUsername("bill")
        .password(passwordEncoder().encode("password"))
        .authorities("read")
        .build();
    var u2 = User.withUsername("john")
        .password(passwordEncoder().encode("password"))
        .authorities("write")
        .build();

    return new InMemoryUserDetailsManager(u1, u2);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
