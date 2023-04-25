package org.eclipse.tractusx.edc.edr.spi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

class EndpointDataReferenceEntryTest {

    @Test
    void verify_serializeDeserialize() throws JsonProcessingException {
        var mapper = new ObjectMapper();

        var entry = EndpointDataReferenceEntry.Builder.newInstance()
                .assetId(randomUUID().toString())
                .agreementId(randomUUID().toString())
                .transferProcessId(randomUUID().toString())
                .build();

        var serialized = mapper.writeValueAsString(entry);
        var deserialized = mapper.readValue(serialized, EndpointDataReferenceEntry.class);

        assertThat(deserialized.getTransferProcessId()).isNotEmpty();
        assertThat(deserialized.getAssetId()).isNotEmpty();
        assertThat(deserialized.getAgreementId()).isNotEmpty();
    }
}
