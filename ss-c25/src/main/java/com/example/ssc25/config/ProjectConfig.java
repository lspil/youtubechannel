package com.example.ssc25.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

  @Bean
  public UserDetailsService userDetailsService() {
    var uds = new InMemoryUserDetailsManager();

    UserDetails u1 = User.withUsername("bill")
            .password("12345")
            .authorities("read")
            .build();

    UserDetails u2 = User.withUsername("john")
            .password("12345")
            .authorities("write")
            .build();

    uds.createUser(u1);
    uds.createUser(u2);

    return uds;
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.httpBasic();

    // mvcMatcher()
    // antMatcher()
    //    --> ANT path expressions

    // /a/**   /a        **    /a/**/b        /a/b  /a/b/b  /a/b/c/b/c/b
    //         /a/b
    //         /a/c
    //         /a/b/c


    // /a/*   /a  /a/b   /a/b/c

//    http.authorizeRequests()
//            .antMatchers("/a/**").hasAuthority("read")
//            .mvcMatchers("/b").hasAuthority("write")
//            .mvcMatchers("/b/*").authenticated()
//            .mvcMatchers("/c/{name}").authenticated()
//            .anyRequest().denyAll();

    http.authorizeRequests()
            .mvcMatchers(HttpMethod.GET, "/a").authenticated()  // /a  /a/
            .anyRequest().permitAll();
  }
}
