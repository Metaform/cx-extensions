package org.eclipse.tractusx.edc.edr.core.defaults;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.edc.spi.types.domain.edr.EndpointDataReference;
import org.eclipse.tractusx.edc.edr.spi.EndpointDataReferenceEntry;

/**
 * A wrapper to persist {@link EndpointDataReferenceEntry}s and {@link EndpointDataReference}s.
 */
public class PersistentCacheEntry {
    private EndpointDataReferenceEntry edrEntry;
    private EndpointDataReference edr;

    public EndpointDataReferenceEntry getEdrEntry() {
        return edrEntry;
    }

    public EndpointDataReference getEdr() {
        return edr;
    }

    public PersistentCacheEntry(@JsonProperty("edrEntry") EndpointDataReferenceEntry edrEntry, @JsonProperty("edr") EndpointDataReference edr) {
        this.edrEntry = edrEntry;
        this.edr = edr;
    }
}
