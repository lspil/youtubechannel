package com.example.ssm_2023_e1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    // authentication
    http.httpBasic().and().formLogin();

    // authorization
    http.authorizeHttpRequests()
        .anyRequest().authenticated();

    return http.build();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    UserDetails u = User.builder()
        .username("bill")
        .password(passwordEncoder().encode("password"))
        .authorities("read")  // used for authorization
        .build();

    return new InMemoryUserDetailsManager(u);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
