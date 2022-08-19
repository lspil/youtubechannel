package com.example.ss_2022_c5_e1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/demo")
  public String demo() {
    return "Demo!";
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello!";
  }

}
