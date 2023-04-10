package com.example.ssm_2023_e2.exceptions;

public class UsernameAlreadyExistsException extends RuntimeException {

  public UsernameAlreadyExistsException() {
    super("Username already exists");
  }
}
