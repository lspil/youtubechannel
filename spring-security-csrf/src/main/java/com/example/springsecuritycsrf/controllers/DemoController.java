package com.example.springsecuritycsrf.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String getDemo() {
        return "Get Demo!";
    }

    @PostMapping("/demo")
    public String postDemo() {
        return "Post Demo!";
    }
}
