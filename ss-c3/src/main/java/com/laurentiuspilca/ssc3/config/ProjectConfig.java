package com.laurentiuspilca.ssc3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public JdbcUserDetailsManager userDetailsService() {
        // InMemoryUserDetailsManager
        // JdbcUserDetailsManager
        return new JdbcUserDetailsManager(dataSource());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DataSource dataSource() {
        var dataSource = new DriverManagerDataSource();

        dataSource.setUrl("jdbc:mysql://localhost/spring");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        return dataSource;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();

        http.csrf().disable(); // CSRF tokens ...

        http.authorizeRequests()
                .mvcMatchers("/user").permitAll()
                .anyRequest().authenticated();
    }
}
