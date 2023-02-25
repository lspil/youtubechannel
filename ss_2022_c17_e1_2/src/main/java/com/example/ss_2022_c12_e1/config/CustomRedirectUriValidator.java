package com.example.ss_2022_c12_e1.config;

import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2ErrorCodes;
import org.springframework.security.oauth2.server.authorization.authentication.OAuth2AuthorizationCodeRequestAuthenticationContext;
import org.springframework.security.oauth2.server.authorization.authentication.OAuth2AuthorizationCodeRequestAuthenticationException;
import org.springframework.security.oauth2.server.authorization.authentication.OAuth2AuthorizationCodeRequestAuthenticationToken;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;

import java.util.function.Consumer;

public class CustomRedirectUriValidator implements Consumer<OAuth2AuthorizationCodeRequestAuthenticationContext> {

  @Override
  public void accept(OAuth2AuthorizationCodeRequestAuthenticationContext context) {
    OAuth2AuthorizationCodeRequestAuthenticationToken a = context.getAuthentication();
    RegisteredClient registeredClient = context.getRegisteredClient();
    String uri = a.getRedirectUri();

    if (!registeredClient.getRedirectUris().contains(uri)) {
      var error = new OAuth2Error(OAuth2ErrorCodes.INVALID_REQUEST);
      throw new OAuth2AuthorizationCodeRequestAuthenticationException(error, null);
    }
  }
}
