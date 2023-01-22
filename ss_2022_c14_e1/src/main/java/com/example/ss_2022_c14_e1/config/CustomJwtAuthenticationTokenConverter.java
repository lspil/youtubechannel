package com.example.ss_2022_c14_e1.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

import java.util.List;

public class CustomJwtAuthenticationTokenConverter implements Converter<Jwt, CustomJwtAuthenticationToken> {


  @Override
  public CustomJwtAuthenticationToken convert(Jwt source) {
    List<String> authorities = (List<String>) source.getClaims().get("authorities");
    CustomJwtAuthenticationToken authenticationObj =
        new CustomJwtAuthenticationToken(source, authorities.stream().map(SimpleGrantedAuthority::new).toList());

    return authenticationObj;
  }
}
