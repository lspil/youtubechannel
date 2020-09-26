package com.example.ssc28.controller;

import com.example.ssc28.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

  private final DemoService service;

  public DemoController(DemoService service) {
    this.service = service;
  }

  @GetMapping("/test1")
  public String test1() {
    return service.test1();
  }

  @GetMapping("/test2")
  public String test2() {
    return service.test2();
  }

  @GetMapping("/test3")
  public String test3() {
    return service.test3();
  }

  @GetMapping("/test4")
  public List<String> test4() {
    List<String> list = new ArrayList<>();
    list.add("john");
    list.add("bill");
    list.add("mary");
    return service.test4(list);
  }

  @GetMapping("/test5")
  public List<String> test5() {
    List<String> list = List.of("john", "bill", "mary"); // immutable
    return service.test4(list);
  }

  @GetMapping("/test6")
  public List<String> test6() {
    return service.test5();
  }
}
