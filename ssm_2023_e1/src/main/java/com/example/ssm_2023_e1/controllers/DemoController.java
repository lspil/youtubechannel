package com.example.ssm_2023_e1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello";
  }

  @PostMapping("/demo")
  public String demo() {
    return "Demo";
  }
}
