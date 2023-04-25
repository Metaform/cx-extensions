package org.eclipse.tractusx.edc.dataplane.proxy.spi.provider.gateway.authorization;

import org.jetbrains.annotations.Nullable;

/**
 * Manages {@link AuthorizationHandler}s.
 */
public interface AuthorizationHandlerRegistry {

    /**
     * Returns a handler for the alias or null if not found.
     */
    @Nullable
    AuthorizationHandler getHandler(String alias);

    /**
     * Registers a handler for the given alias.
     */
    void register(String alias, AuthorizationHandler handler);

}
