package com.example.ssm_2023_e2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String username;

  private String password;

  @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
  private Set<Authority> authorities;

}
