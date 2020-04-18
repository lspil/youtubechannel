package com.example.ssc10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller   // 2 annotations @Controller + @ResponseBody = @RestController
public class MainController {

    @GetMapping("/")
    public String main() {  // Spring MVC -> Spring will look to find the main.html
      return "main.html";
    }

    @PostMapping("/test")
    @ResponseBody
//    @CrossOrigin("*") // all origins http://example.com
    public String test() { // spring knows it doesn't have to look for a page
        System.out.println(":(");
        return "TEST!";
    }
}
