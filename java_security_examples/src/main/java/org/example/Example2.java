package org.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Example2 {

    public static void main(String[] args) {
        // Hashing

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            String input = "to be hashed";

            byte [] digested = md.digest(input.getBytes());

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < digested.length; i++) {
                output.append(Integer.toHexString(digested[i] & 0xFF));
            }

            System.out.println(output);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }
}
