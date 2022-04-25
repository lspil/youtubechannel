package com.example.sr_c2_e2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

  @Value("${products.service.base.url}")
  private String baseUrl;

  @Bean
  public WebClient webClient() {
    return WebClient.builder()
        .baseUrl(baseUrl)
        .build();
  }
}
