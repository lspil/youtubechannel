package com.example.springsecuritymongo.services;

import com.example.springsecuritymongo.repositories.UserRepository;
import com.example.springsecuritymongo.security.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

public class MongoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userRepository.findUserByUsername(username);
        var u = user.orElseThrow(() -> new UsernameNotFoundException(":("));
        return new SecurityUser(u);
    }
}
