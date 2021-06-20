package com.example.sae11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;

@RestController
public class DemoController {

    @GetMapping("/hash/bcrypt/{pass}")
    public String hashPass1(@PathVariable String pass) {
        return new BCryptPasswordEncoder().encode(pass);
    }

    @GetMapping("/hash/md5/{pass}")
    public String hashPass2(@PathVariable String pass) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("md5");
        byte [] digested = messageDigest.digest(pass.getBytes());
        StringBuilder out = new StringBuilder();
        for (int i=0; i<digested.length; i++) {
            out.append(Integer.toHexString(0xFF & digested[i]));
        }

        return out.toString();
    }
}
