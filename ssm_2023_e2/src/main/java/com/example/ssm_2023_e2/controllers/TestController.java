package com.example.ssm_2023_e2.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

  /**
   * @PreAuthorize
   * @PostAuthorize
   * @PreFilter
   * @PostFilter
   */

  @GetMapping("/test/{smth}")
  @PreAuthorize("@testEndpointAuthorizationManager.authorize(#TestEndpointAuthorizationManager.#Type.#A, #smth)")
  public String test(@PathVariable String smth) {
    return "test";
  }

  @GetMapping("/demo")
  public String demo() {
    return "demo";
  }

  // read, write, delete, access, execute ---> authorities
  // ADMIN, MANAGER, USER, CLIENT, ADMINISTRATOR ---> roles
  // GrantedAuthority  ----> something with a name
      // ROLE_ADMIN, ROLE_MANAGER, ROLE_USER
}
