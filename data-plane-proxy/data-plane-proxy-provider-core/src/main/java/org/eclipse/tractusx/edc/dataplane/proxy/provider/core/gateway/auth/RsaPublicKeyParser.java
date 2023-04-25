package org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.auth;

import org.eclipse.edc.spi.EdcException;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * A thread-safe parser than can read RSA public keys stored using PEM encoding.
 */
public class RsaPublicKeyParser {
    private static final String HEADER = "-----BEGIN PUBLIC KEY-----";
    private static final String FOOTER = "-----END PUBLIC KEY-----";
    private final KeyFactory keyFactory;

    public RsaPublicKeyParser() {
        try {
            keyFactory = KeyFactory.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            throw new EdcException(e);
        }
    }

    /**
     * Parses the PEM-encoded key.
     */
    public RSAPublicKey parsePublicKey(String serialized) {
        var keyPortion = serialized.replace(HEADER, "").replace(FOOTER, "").replaceAll("\\s", "");

        var publicKeyDer = Base64.getDecoder().decode(keyPortion);
        var spec = new X509EncodedKeySpec(publicKeyDer);
        try {
            return (RSAPublicKey) keyFactory.generatePublic(spec);
        } catch (InvalidKeySpecException e) {
            throw new EdcException(e);
        }
    }
}
