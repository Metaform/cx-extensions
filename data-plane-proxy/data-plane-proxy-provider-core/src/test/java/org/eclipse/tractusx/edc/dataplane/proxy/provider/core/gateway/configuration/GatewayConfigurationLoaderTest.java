package org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.configuration;

import org.eclipse.edc.spi.system.ServiceExtensionContext;
import org.eclipse.edc.spi.system.configuration.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;
import static org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.configuration.GatewayConfigurationLoader.AUTHORIZATION_TYPE;
import static org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.configuration.GatewayConfigurationLoader.PROXIED_PATH;
import static org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.configuration.GatewayConfigurationLoader.TX_GATEWAY_PREFIX;
import static org.eclipse.tractusx.edc.dataplane.proxy.spi.provider.gateway.configuration.GatewayConfiguration.NO_AUTHORIZATION;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GatewayConfigurationLoaderTest {

    @Test
    void verify_loadConfiguration() {
        var context = mock(ServiceExtensionContext.class);

        var config = ConfigFactory.fromMap(
                Map.of(format("alias.%s", AUTHORIZATION_TYPE), NO_AUTHORIZATION,
                        format("alias.%s", PROXIED_PATH), "https://test.com"));
        when(context.getConfig(TX_GATEWAY_PREFIX)).thenReturn(config);

        var configurations = GatewayConfigurationLoader.loadConfiguration(context);

        assertThat(configurations).isNotEmpty();
        var configuration = configurations.get(0);

        assertThat(configuration.getAlias()).isEqualTo("alias");
        assertThat(configuration.getAuthorizationType()).isEqualTo(NO_AUTHORIZATION);
        assertThat(configuration.getProxiedPath()).isEqualTo("https://test.com");
    }
}
