package com.example.oauth2_marathon_e1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.oauth2.core.AuthorizationGrantType;

@Entity
@Table(name = "grant_types")
@Getter
@Setter
public class GrantType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "grant_type")
  private String grantType;

  @ManyToOne
  private Client client;

  public static GrantType from(AuthorizationGrantType authorizationGrantType, Client c) {
    GrantType g = new GrantType();

    g.setGrantType(authorizationGrantType.getValue());
    g.setClient(c);

    return g;
  }
}
