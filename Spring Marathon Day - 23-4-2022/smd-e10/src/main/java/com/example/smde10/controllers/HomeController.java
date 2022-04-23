package com.example.smde10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  /// telling Spring MVC this is a controller class
public class HomeController {

  @GetMapping("/home")
  public String home() {
    return "home.html";
  }
}
