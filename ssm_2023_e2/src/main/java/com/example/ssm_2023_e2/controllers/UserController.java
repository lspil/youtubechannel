package com.example.ssm_2023_e2.controllers;

import com.example.ssm_2023_e2.entities.User;
import com.example.ssm_2023_e2.services.CustomUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

  private final CustomUserDetailsService customUserDetailsService;

  @PostMapping("/user")
  public void saveUser(@RequestBody User user) {
    customUserDetailsService.createUser(user);
  }
}
