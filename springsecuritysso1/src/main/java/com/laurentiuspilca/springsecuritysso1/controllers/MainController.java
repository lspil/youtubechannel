package com.laurentiuspilca.springsecuritysso1.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(OAuth2AuthenticationToken user) {
        System.out.println(user);
        return "home.html";
    }
}
