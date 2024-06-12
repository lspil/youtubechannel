package org.example;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

public class Example3 {

    public static void main(String[] args) {
        // encryption -> key pairs

        String value = "Value to be encrypted";

        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(2048);

            KeyPair keyPair = generator.generateKeyPair();

            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // public key -> encrypt
            // private key -> decrypt

            // ------------------------------------------------

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte [] encrypted = cipher.doFinal(value.getBytes());

            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte [] decrypted = cipher.doFinal(encrypted);

            System.out.println(new String(decrypted));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
