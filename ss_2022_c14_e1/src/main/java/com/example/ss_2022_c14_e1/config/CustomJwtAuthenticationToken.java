package com.example.ss_2022_c14_e1.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

import java.util.Collection;

public class CustomJwtAuthenticationToken extends JwtAuthenticationToken {

  private String blaBla;

  public CustomJwtAuthenticationToken(Jwt jwt, Collection<? extends GrantedAuthority> authorities) {
    super(jwt, authorities);
    blaBla = ":)";
  }
}
