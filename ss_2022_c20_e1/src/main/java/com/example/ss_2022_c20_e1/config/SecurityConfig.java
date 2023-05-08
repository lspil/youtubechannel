package com.example.ss_2022_c20_e1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableReactiveMethodSecurity
public class SecurityConfig {

  @Bean
  public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
    http.httpBasic()
        .and()
        .formLogin();

    http.authorizeExchange()
//        .pathMatchers("/demo").hasAnyAuthority("read")
        .anyExchange().authenticated();

    return http.build();
  }

  @Bean
  public ReactiveUserDetailsService userDetailsService() {
    UserDetails u1 = User.withUsername("bill")
        .password(passwordEncoder().encode("12345"))
        .authorities("read")
        .build();

    UserDetails u2 = User.withUsername("josh")
        .password(passwordEncoder().encode("12345"))
        .authorities("write")
        .build();

    return new MapReactiveUserDetailsService(u1, u2);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
