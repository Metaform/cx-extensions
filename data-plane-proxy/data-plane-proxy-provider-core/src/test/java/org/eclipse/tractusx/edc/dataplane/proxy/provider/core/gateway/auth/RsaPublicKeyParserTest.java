package org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.auth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Verifies RSA public key parsing.
 */
class RsaPublicKeyParserTest {

    @Test
    void verify_canParseKey() {
        var key = new RsaPublicKeyParser().parsePublicKey(TestKeys.TEST_PUBLIC_KEY);
        assertNotNull(key);
    }
}
