package org.example;

import java.security.*;

public class Example4 {

    public static void main(String[] args) {
        // signing!

        String value = "Value to be encrypted";

        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(2048);

            KeyPair keyPair = generator.generateKeyPair();

            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // public key -> validate
            // private key -> sign

            // ---------------------------------------------------------------

            Signature signature = Signature.getInstance("SHA256withRSA");

            signature.initSign(privateKey);
            signature.update(value.getBytes());
            byte [] sign = signature.sign();

            signature.initVerify(publicKey);
//            signature.update(value.getBytes());
            signature.update("Something else :0".getBytes());
            boolean valid = signature.verify(sign);

            System.out.println(valid);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
