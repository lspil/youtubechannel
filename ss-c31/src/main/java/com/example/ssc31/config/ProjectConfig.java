package com.example.ssc31.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableReactiveMethodSecurity
public class ProjectConfig {

  @Bean
  public ReactiveUserDetailsService userDetailsService() {
    var u1 = User.withUsername("john")
        .password("12345")
        .authorities("read")
        .build();

    var u2 = User.withUsername("bill")
        .password("12345")
        .authorities("write")
        .build();

    return new MapReactiveUserDetailsService(u1, u2);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }

  @Bean
  public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
    return http
            .authorizeExchange()
              .anyExchange().hasAuthority("read")
            .and().httpBasic()
            .and().build();
  }

}
