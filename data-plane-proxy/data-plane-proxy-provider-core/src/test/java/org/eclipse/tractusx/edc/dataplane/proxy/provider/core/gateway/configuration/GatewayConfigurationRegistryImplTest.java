package org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.configuration;

import org.eclipse.tractusx.edc.dataplane.proxy.spi.provider.gateway.configuration.GatewayConfiguration;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GatewayConfigurationRegistryImplTest {

    @Test
    void verify_Configuration() {
        var registry = new GatewayConfigurationRegistryImpl();
        registry.register(GatewayConfiguration.Builder.newInstance().proxiedPath("https://test.com").alias("alias").build());

        assertThat(registry.getConfiguration("alias")).isNotNull();
    }
}
