package org.example.entities.generators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.security.*;
import java.util.Base64;
import java.util.UUID;

public class UUIDGenerator implements IdentifierGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        return sign(UUID.randomUUID().toString());
    }

    private String sign(String primaryKeyValue) {
        try {
            KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
            kg.initialize(2048);
            KeyPair kp = kg.generateKeyPair();
            PrivateKey pk = kp.getPrivate();

            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(pk);
            signature.update(primaryKeyValue.getBytes());
            byte [] result = signature.sign();

            return primaryKeyValue + "." + Base64.getEncoder().encodeToString(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
