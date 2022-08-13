package com.example.ss_2022_c4_e1.config;

import com.example.ss_2022_c4_e1.config.filters.ApiKeyFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class SecurityConfig {

  @Value("${the.secret}")
  private String key;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http.httpBasic()
          .and()
          .addFilterBefore(new ApiKeyFilter(key), BasicAuthenticationFilter.class)
        .authorizeRequests().anyRequest().authenticated()   // authorization
        //.and().authenticationManager()   or  by adding a bean of type AuthenticationManager
        //.and().authenticationProvider() it doesn't override the AP, it adds one more to the collection
        .and().build();
  }
}
