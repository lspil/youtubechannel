package com.example.ssm_2023_e2.auhorization;

import org.springframework.stereotype.Component;

@Component
public class TestEndpointAuthorizationManager {

  public boolean authorize(Type t, String smth) {
    // lots of logic
    return Type.A == t;
  }

  enum Type {
    A, B, C, D
  }
}
