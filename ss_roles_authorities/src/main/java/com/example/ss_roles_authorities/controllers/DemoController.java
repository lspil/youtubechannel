package com.example.ss_roles_authorities.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/demo")
  @PreAuthorize("hasAuthority('write') or hasRole('ADMIN')")
  public String demo() {   // bill should be able to access this
    var c = SecurityContextHolder.getContext().getAuthentication();

    return "Demo";
  }

  @GetMapping("/test")
  @PreAuthorize("hasAnyRole('CLIENT', 'ADMIN')")
  public String test() {   // john should be able to access this
    var c = SecurityContextHolder.getContext().getAuthentication();

    return "Test";
  }
}
