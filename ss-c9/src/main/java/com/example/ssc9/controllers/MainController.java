package com.example.ssc9.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping
    public String main() {
        return "main.html";
    }

    @PostMapping("/change") // POST, PUT, DELETE mutating actions in REST
    public String doSmth() {
        System.out.println(":(");
        return "main.html";
    }
}
