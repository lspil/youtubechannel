package com.example.ssc28.service;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

  // PRE/POST AUTHORIZATION

  @PreAuthorize("hasAuthority('read')")
  public String test1() {
    System.out.println("TEST 1");
    return "TEST1";
  }

  @PostAuthorize("hasAuthority('read')")
  public String test2() {
    System.out.println("TEST 2");
    return "TEST2";
  }

  @PostAuthorize("returnObject == authentication.name")
  public String test3() {
    System.out.println("TEST 3");
    // select some data from a database
    return "john";
  }

  // PRE/POST FILTERING

  @PreFilter("filterObject != authentication.name")
  public List<String> test4(List<String> list) {
    System.out.println(list);
    return list;
  }

  @PostFilter("filterObject != authentication.name")
  public List<String> test5() {
    List<String> list = new ArrayList<>();
    list.add("john");
    list.add("bill");
    list.add("mary");
    return list;
  }
}
