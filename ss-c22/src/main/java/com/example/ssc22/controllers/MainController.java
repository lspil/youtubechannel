package com.example.ssc22.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping
  public String main(Authentication authentication) {
    System.out.println(authentication);
    return "main.html";
  }
}
