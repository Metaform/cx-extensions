package org.eclipse.tractusx.edc.edr.core;

import com.fasterxml.jackson.core.type.TypeReference;
import org.eclipse.edc.runtime.metamodel.annotation.Extension;
import org.eclipse.edc.runtime.metamodel.annotation.Inject;
import org.eclipse.edc.runtime.metamodel.annotation.Provider;
import org.eclipse.edc.spi.EdcException;
import org.eclipse.edc.spi.monitor.Monitor;
import org.eclipse.edc.spi.system.ServiceExtension;
import org.eclipse.edc.spi.types.TypeManager;
import org.eclipse.tractusx.edc.edr.core.defaults.InMemoryEndpointDataReferenceCache;
import org.eclipse.tractusx.edc.edr.core.defaults.PersistentCacheEntry;
import org.eclipse.tractusx.edc.edr.spi.EndpointDataReferenceCache;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static java.lang.String.format;
import static java.util.Collections.emptyList;
import static org.eclipse.edc.util.configuration.ConfigurationFunctions.propOrEnv;

/**
 * Registers default services for the EDR cache.
 */
@Extension(value = EdrCacheCoreExtension.NAME)
public class EdrCacheCoreExtension implements ServiceExtension {
    static final String NAME = "EDR Cache Core";

    private static final TypeReference<List<PersistentCacheEntry>> TYPE_REFERENCE = new TypeReference<>() {
    };

    @Inject
    private Monitor monitor;

    @Inject
    private TypeManager typeManager;

    @Override
    public String name() {
        return NAME;
    }

    @Provider(isDefault = true)
    public EndpointDataReferenceCache edrCache() {
        var location = propOrEnv("tx.edr.cache.memory.file", null);
        var cache = new InMemoryEndpointDataReferenceCache();
        if (location != null) {
            var entries = loadSeedFile(location);
            entries.forEach(entry -> cache.save(entry.getEdrEntry(), entry.getEdr()));
            monitor.info(format("Seeded test EDR cache with %s entries", entries.size()));
        }
        return cache;
    }

    private List<PersistentCacheEntry> loadSeedFile(String configLocation) {
        var path = new File(configLocation);
        if (!path.exists()) {
            monitor.warning(format("Configuration file does not exist: %s. Ignoring.", configLocation));
            return emptyList();
        }

        try {
            return typeManager.getMapper().readValue(path, TYPE_REFERENCE);
        } catch (IOException e) {
            throw new EdcException(e);
        }

    }

}
