package org.example;

import java.security.SecureRandom;
import java.util.Base64;

public class Example1 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        byte [] rawValue = new byte[100];
        random.nextBytes(rawValue);

        String str = Base64.getEncoder().encodeToString(rawValue);

        System.out.println(str);
    }
}