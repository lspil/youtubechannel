package com.example.ssc25.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/a")
  public String a() {
    return "a";
  }

  @GetMapping("/a/b")
  public String ab() {
    return "ab";
  }

  @GetMapping("/a/b/c")
  public String abc() {
    return "abc";
  }

  @GetMapping("/b")
  public String b() {
    return "b";
  }

  @GetMapping("/b/c")
  public String bc() {
    return "b/c";
  }

  @GetMapping("/c/{name}")
  public String c(@PathVariable String name) {
    return "Hello " + name;
  }
}
