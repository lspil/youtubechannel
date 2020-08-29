package com.example.ssc24.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService userDetailsService() {
		var uds = new InMemoryUserDetailsManager();

		// GrantedAuthority

		var u1 = User.withUsername("john")
				.password("12345")
				.authorities("ROLE_ADMIN")  // -> a role ADMIN
				.build();

		var u2 = User.withUsername("bill")
				.password("12345")
				.roles("MANAGER")   // -> authority ROLE_MANAGER
				.build();

		uds.createUser(u1);
		uds.createUser(u2);

		return uds;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic();
		http.csrf().disable();

		/*
		 - hasAuthority()
		 - hasAnyAuthority()
		 - hasRole()
		 - hasAnyRole()
		 - access()  SpEL
		 */

		/*
		 1. Endpoint authorization rules
		 2. (Global) Method Security (@RolesAllowed, @Pre/@Post Authorize, @Pre/@Post Filter, @Secured)
		 */

		/*
		  - MVC matchers
		  - ANT matchers
		  - regex matchers
		 */

		http.authorizeRequests()
				.mvcMatchers("/hello").hasRole("ADMIN")
				.mvcMatchers("/ciao").hasRole("MANAGER")
				.anyRequest().authenticated();
	}
}
