package com.laurentiuspilca.springsecurity102.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/main")
    public String main() {
        return "main.html";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin.html";
    }
}
