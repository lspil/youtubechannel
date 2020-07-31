package com.example.ssc22.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.oauth2Login();

    http.authorizeRequests()
            .anyRequest().authenticated();
  }

  @Bean
  public ClientRegistrationRepository clientRegistrationRepository() {
    return new InMemoryClientRegistrationRepository(gitHubClient()/*, facebookClient()*/);
  }


  private ClientRegistration gitHubClient() {
    return CommonOAuth2Provider.GITHUB.getBuilder("github")
            .clientId("6c1ef83664e1bab10a0f")
            .clientSecret("aa143bb9e01efb6e288b93b4bfc1d98ae51f7c6c")
            .build();
  }

//  private ClientRegistration facebookClient() {
//    return CommonOAuth2Provider.FACEBOOK.getBuilder("facebook")
//            .clientId("client")
//            .clientSecret("secret")
//            .build();
//  }
}
