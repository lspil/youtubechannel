package com.example.ss_2022_c20_e1.controllers;

import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class DemoController {

  @GetMapping(value = "/demo", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  @PreAuthorize("hasAnyAuthority('read')")
  public Flux<Integer> demo() {
    return Flux.just(1,2,3,4,5,6,7)
        .delayElements(Duration.ofSeconds(1));
  }

  @GetMapping("/user")
  public Mono<String> user() {
    return ReactiveSecurityContextHolder.getContext()
        .map(SecurityContext::getAuthentication)
        .map(Authentication::getName);
  }

  @GetMapping("/principal")
  public Mono<String> principal(@AuthenticationPrincipal Mono<Authentication> user) {
    return user.map(Authentication::getName);
  }

}
