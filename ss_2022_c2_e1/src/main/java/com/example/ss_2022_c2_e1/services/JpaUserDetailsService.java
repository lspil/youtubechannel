package com.example.ss_2022_c2_e1.services;

import com.example.ss_2022_c2_e1.repositories.UserRepository;
import com.example.ss_2022_c2_e1.security.SecurityUser;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) {
    var u = userRepository.findUserByUsername(username);

    return u.map(SecurityUser::new)
        .orElseThrow(() -> new UsernameNotFoundException("Username not found " + username));
  }
}
