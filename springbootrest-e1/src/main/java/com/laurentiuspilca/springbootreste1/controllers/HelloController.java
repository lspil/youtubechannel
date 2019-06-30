package com.laurentiuspilca.springbootreste1.controllers;

import com.laurentiuspilca.springbootreste1.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping(path = "/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping(path = "/goodbye")
    public String goodbye(@RequestBody Person p) {
        return "Goodbye, " + p.getName() + "!";
    }

    @GetMapping(path = "/get")
    public Person getPerson() {
        Person p = new Person();
        p.setName("Bill");
        return p;
    }

    @GetMapping(path = "/getall")
    public List<Person> getAllPersons() {
        Person p1 = new Person();
        p1.setName("Bill");

        Person p2 = new Person();
        p2.setName("John");

        return Arrays.asList(p1, p2);
    }

    @GetMapping(path = "/statustest")
    public Person statusTest(HttpServletResponse response) {
        Person p1 = new Person();
        p1.setName("Bill");
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        return p1;
    }

}
