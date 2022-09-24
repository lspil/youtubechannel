package com.example.ss_roles_authorities.security;

import com.example.ss_roles_authorities.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor
public class SecurityUser implements UserDetails {

  private final User user;

  @Override
  public String getPassword() {
    return user.getPassword();
  }

  @Override
  public String getUsername() {
    return user.getUsername();
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {  // authorities AND roles
    var authorities = user.getAuthorities();
    List<GrantedAuthority> roleList = new ArrayList<>();

    for (var a: authorities) {
      if (a.isRole()) {
        roleList.add(new SimpleGrantedAuthority("ROLE_" + a.getName()));
      } else {
        roleList.add(new SimpleGrantedAuthority(a.getName()));
      }
    }

    return roleList;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
