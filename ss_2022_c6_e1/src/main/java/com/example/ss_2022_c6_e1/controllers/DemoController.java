package com.example.ss_2022_c6_e1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

  @GetMapping("/demo1")
  public String test1() {
    return "demo1";
  }

  @GetMapping("/demo2")
  public String test2() {
    return "demo2";
  }

  @PostMapping("/demo3")
  public String test3() {
    return "demo3";
  }
}
