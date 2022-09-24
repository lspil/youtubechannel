package com.example.ss_roles_authorities.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authorities")
@Getter
@Setter
public class Authority {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  private boolean role;

  @ManyToMany(mappedBy = "authorities")
  private Set<User> users;
}
