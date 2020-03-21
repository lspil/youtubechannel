package com.laurentiuspilca.springj142.controllers;

import com.laurentiuspilca.springj142.entities.User;
import com.laurentiuspilca.springj142.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public record UserController(
        UserRepository userRepository
) {

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
