package com.laurentiuspilca.springsecurityjdbcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome.html";
    }
}
