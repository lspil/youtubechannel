package com.example.ss_2022_c3_e1.config.security.authentication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import javax.security.auth.Subject;
import java.util.Collection;

@AllArgsConstructor
@Setter
@Getter
public class CustomAuthentication implements Authentication {

  private final boolean authentication;
  private final String key;

  @Override
  public boolean isAuthenticated() {
    return authentication;
  }

  @Override
  public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

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
