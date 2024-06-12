package org.example;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class Example5 {

    public static void main(String[] args) {

        String value = "Value to be encrypted";

        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

            keyGenerator.init(256);

            SecretKey secretKey = keyGenerator.generateKey();

            // =============================================================

            Cipher cipher = Cipher.getInstance("AES");

            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte [] encrypted = cipher.doFinal(value.getBytes());

            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte [] decrypted = cipher.doFinal(encrypted);

            System.out.println(new String(decrypted));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
