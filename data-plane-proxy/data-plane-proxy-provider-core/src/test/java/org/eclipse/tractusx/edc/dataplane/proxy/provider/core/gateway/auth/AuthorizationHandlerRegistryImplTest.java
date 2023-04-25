package org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.auth;

import org.eclipse.tractusx.edc.dataplane.proxy.spi.provider.gateway.authorization.AuthorizationHandler;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class AuthorizationHandlerRegistryImplTest {

    @Test
    void verify_registration() {
        var registry = new AuthorizationHandlerRegistryImpl();
        registry.register("alias", mock(AuthorizationHandler.class));

        assertThat(registry.getHandler("alias")).isNotNull();
    }
}
