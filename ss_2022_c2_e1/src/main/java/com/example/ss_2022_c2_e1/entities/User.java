package com.example.ss_2022_c2_e1.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String username;

  private String password;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "users_authorities",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "authority_id")
  )
  private Set<Authority> authorities;
}
