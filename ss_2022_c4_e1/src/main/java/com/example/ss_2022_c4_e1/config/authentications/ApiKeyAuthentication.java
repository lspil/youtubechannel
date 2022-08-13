package com.example.ss_2022_c4_e1.config.authentications;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import javax.security.auth.Subject;
import java.util.Collection;

@RequiredArgsConstructor
public class ApiKeyAuthentication implements Authentication {

  private final String key;
  private boolean authenticated;

  @Override
  public boolean isAuthenticated() {
    return authenticated;
  }

  @Override
  public void setAuthenticated(boolean authenticated) throws IllegalArgumentException {
    this.authenticated = authenticated;
  }

  public String getKey() {
    return key;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public Object getCredentials() {
    return null;
  }

  @Override
  public Object getDetails() {
    return null;
  }

  @Override
  public Object getPrincipal() {
    return null;
  }

  @Override
  public boolean implies(Subject subject) {
    return Authentication.super.implies(subject);
  }

  @Override
  public String getName() {
    return null;
  }
}
