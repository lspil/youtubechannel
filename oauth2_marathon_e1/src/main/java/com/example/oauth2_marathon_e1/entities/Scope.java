package com.example.oauth2_marathon_e1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "scopes")
@Getter
@Setter
public class Scope {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String scope;

  @ManyToOne
  private Client client;

  public static Scope from(String scope, Client client) {
    Scope s = new Scope();

    s.setScope(scope);
    s.setClient(client);

    return s;
  }
}
