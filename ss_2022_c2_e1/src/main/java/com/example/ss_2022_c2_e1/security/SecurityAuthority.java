package com.example.ss_2022_c2_e1.security;

import com.example.ss_2022_c2_e1.entities.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

  private final Authority authority;

  @Override
  public String getAuthority() {
    return authority.getName();
  }
}
