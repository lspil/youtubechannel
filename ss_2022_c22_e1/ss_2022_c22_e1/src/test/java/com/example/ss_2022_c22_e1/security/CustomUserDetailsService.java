package com.example.ss_2022_c22_e1.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails u1 = User.withUsername(username).password("12345").authorities("read").build();
        UserDetails u2 = User.withUsername(username).password("12345").authorities("read").build();
        UserDetails u3 = User.withUsername(username).password("12345").authorities("read").build();


        return u1;
    }
}
