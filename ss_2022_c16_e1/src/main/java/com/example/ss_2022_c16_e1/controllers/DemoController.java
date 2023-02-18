package com.example.ss_2022_c16_e1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoController {

  private final OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager;  // proxy

  @GetMapping("/token")
  public String token() {
    OAuth2AuthorizeRequest request = OAuth2AuthorizeRequest
        .withClientRegistrationId("1")
        .principal("client")
        .build();

    OAuth2AuthorizedClient client = oAuth2AuthorizedClientManager.authorize(request); // request to the AS

    return client.getAccessToken().getTokenValue(); // added on the Authorization header on the request "Bearer ..."
  }
}
