package com.laurentiuspilca.ssc5.security.providers;

import com.laurentiuspilca.ssc5.security.authentication.CustomAuthentication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Value("${key}")
    private String key;

    @Override
    public Authentication authenticate(Authentication authentication) {
        String requestKey = authentication.getName();
        if (requestKey.equals(key)) {
            var a = new CustomAuthentication(null, null, null);
            return a;
        } else {
            throw new BadCredentialsException("Booo!");
        }
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return CustomAuthentication.class.equals(aClass);
    }
}
