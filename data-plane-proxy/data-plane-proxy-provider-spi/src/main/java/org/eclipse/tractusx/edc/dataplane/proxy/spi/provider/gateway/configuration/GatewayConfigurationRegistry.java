package org.eclipse.tractusx.edc.dataplane.proxy.spi.provider.gateway.configuration;

import org.jetbrains.annotations.Nullable;

/**
 * Manages {@link GatewayConfiguration}s.
 */
public interface GatewayConfigurationRegistry {

    /**
     * Returns the configuration for the given alias or null if not found.
     */
    @Nullable
    GatewayConfiguration getConfiguration(String alias);

    /**
     * Registers a configuration for the given alias.
     */
    void register(GatewayConfiguration configuration);

}
