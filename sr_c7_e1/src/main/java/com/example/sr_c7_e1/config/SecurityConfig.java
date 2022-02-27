package com.example.sr_c7_e1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

  @Value("${keys.uri}")
  private String keysUri;

//  @Bean
//  public ReactiveUserDetailsService userDetailsService() {
//    var u1 = User.withUsername("john")
//        .password(passwordEncoder().encode("12345"))
//        .authorities("read")
//        .build();
//
//    return new MapReactiveUserDetailsService(u1);
//  }
//
//  @Bean
//  public PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }

  @Bean
  public SecurityWebFilterChain webFilterChain(ServerHttpSecurity http) {
    return http
            .oauth2ResourceServer(
                j -> j.jwt().jwkSetUri(keysUri)
            )
            .authorizeExchange()
              .pathMatchers("/demo/**").authenticated()
              .anyExchange().permitAll()
          .and()
            .build();
  }

}
