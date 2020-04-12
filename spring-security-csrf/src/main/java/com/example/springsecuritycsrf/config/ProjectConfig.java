package com.example.springsecuritycsrf.config;

import com.example.springsecuritycsrf.filters.CsrfLoggerFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();

        http.addFilterAfter(
                new CsrfLoggerFilter(),
                CsrfFilter.class);

//        http.csrf(c -> {
//            c.csrfTokenRepository();
//        });
    }
}
