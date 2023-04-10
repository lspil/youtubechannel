package com.example.ss_2022_c18_e1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {

  @GetMapping("/")
  public String index() {
    return "index.html";
  }

  @PostMapping("/smth")
  public String doSmth() {
    System.out.println(":)");
    return "index";
  }

}
