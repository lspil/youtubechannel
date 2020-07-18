package com.example.ssc21rs2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.oauth2ResourceServer(
            c -> c.jwt(
                    j -> j.decoder(decoder())
            )
    );

    http.authorizeRequests()
            .anyRequest().authenticated();
  }

  @Bean
  public JwtDecoder decoder() {
    String kv = "ffdhshgfjhgjhkjhkjhgjgffddsfdsgfdhgjhgkjlklklkjkjh";

    SecretKey key =
            new SecretKeySpec(kv.getBytes(), 0, kv.getBytes().length, "AES");

    return NimbusJwtDecoder
            .withSecretKey(key).build();
  }
}
