package com.example.ssm_2023_e3.controllers;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

  @GetMapping("/test1")
  @PreAuthorize("hasAuthority('read')")
  public String test1() {
    System.out.println(":)");
    return "test1";
  }

  @GetMapping("/test2")
  @PostAuthorize("returnObject == 'test2'")
  public String test2() {
    System.out.println(":(");
    return "test2";
  }

  @GetMapping("/test3")
  @PreFilter("filterObject.contains('a')")
  public void test3(@RequestBody List<String> values) {
    values.forEach(System.out::println);  // in the console only words conatining the letter a will be printed
  }

  @GetMapping("/test4")
  @PostFilter("filterObject.contains('a')")
  public List<String> test3() {
    List<String> list = new ArrayList<>();
    list.add("qwerty");
    list.add("azerty");
    list.add("qwerta");
    list.add("tyuiop");

//    List<String> list = List.of("qwerty", "azerty", "qwerta", "tyuiop");  immutable -> doesn't work

    return list;
  }
}
