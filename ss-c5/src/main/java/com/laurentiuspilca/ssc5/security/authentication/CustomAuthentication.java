package com.laurentiuspilca.ssc5.security.authentication;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class CustomAuthentication
        extends UsernamePasswordAuthenticationToken {

    public CustomAuthentication(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public CustomAuthentication(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}
