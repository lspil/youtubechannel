package com.example.ssc31.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DemoController {

  @GetMapping("/demo")
  @PreAuthorize("hasAuthority('read')")
  public Mono<String> demo() {
//    return Mono.just("Demo!");

    Mono<Authentication> ma = ReactiveSecurityContextHolder.getContext()
                                .map(sc -> sc.getAuthentication());
    return ma.map(a -> "Hello, " + a.getName());
  }
}
