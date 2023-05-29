package com.example.oauth2_marathon_e1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "redirect_urls")
@Getter
@Setter
public class RedirectUrl {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String url;

  @ManyToOne
  private Client client;

  public static RedirectUrl from(String url, Client c) {
    RedirectUrl redirectUrl = new RedirectUrl();

    redirectUrl.setUrl(url);
    redirectUrl.setClient(c);

    return redirectUrl;
  }
}
