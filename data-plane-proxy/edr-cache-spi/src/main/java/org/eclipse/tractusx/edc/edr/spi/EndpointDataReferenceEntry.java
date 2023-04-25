package org.eclipse.tractusx.edc.edr.spi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.eclipse.edc.spi.types.domain.edr.EndpointDataReference;

import static java.util.Objects.requireNonNull;

/**
 * An entry in the cache for an {@link EndpointDataReference}.
 */
@JsonDeserialize(builder = EndpointDataReferenceEntry.Builder.class)
public class EndpointDataReferenceEntry {
    private String assetId;
    private String agreementId;
    private String transferProcessId;

    public String getAssetId() {
        return assetId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public String getTransferProcessId() {
        return transferProcessId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        var that = (EndpointDataReferenceEntry) o;

        return transferProcessId.equals(that.transferProcessId);
    }

    private EndpointDataReferenceEntry() {
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        private final EndpointDataReferenceEntry entry;

        @JsonCreator
        public static Builder newInstance() {
            return new Builder();
        }

        public Builder assetId(String assetId) {
            entry.assetId = assetId;
            return this;
        }

        public Builder agreementId(String agreementId) {
            entry.agreementId = agreementId;
            return this;
        }

        public Builder transferProcessId(String transferProcessId) {
            entry.transferProcessId = transferProcessId;
            return this;
        }

        public EndpointDataReferenceEntry build() {
            requireNonNull(entry.assetId, "assetId");
            requireNonNull(entry.agreementId, "agreementId");
            requireNonNull(entry.transferProcessId, "transferProcessId");
            return entry;
        }

        private Builder() {
            entry = new EndpointDataReferenceEntry();
        }
    }

}
