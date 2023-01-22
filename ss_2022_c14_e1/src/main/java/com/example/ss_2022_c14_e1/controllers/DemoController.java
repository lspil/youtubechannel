package com.example.ss_2022_c14_e1.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/demo")
  public String demo(Authentication a) {
    return "Demo!";
  }
}
