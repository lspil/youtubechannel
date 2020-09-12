package com.example.ssc26as.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthConfig extends AuthorizationServerConfigurerAdapter {

  @Autowired
  public AuthenticationManager authenticationManager;

  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    clients.inMemory()
            .withClient("client1")
            .secret("secret1")
            .authorizedGrantTypes("password")
            .scopes("read");
  }


  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    endpoints.authenticationManager(authenticationManager)
             .tokenStore(tokenStore())
             .accessTokenConverter(converter());
  }

  @Bean
  public TokenStore tokenStore() {
    return new JwtTokenStore(converter());
  }

  @Bean
  public JwtAccessTokenConverter converter() {
    var c = new JwtAccessTokenConverter();

    c.setSigningKey("ymLTU8rq83j4fmJZj60wh4OrMNuntIj4fmJ");

    return c;
  }
}
