package org.eclipse.tractusx.edc.edr.core.defaults;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.edc.spi.types.domain.edr.EndpointDataReference;
import org.eclipse.tractusx.edc.edr.spi.EndpointDataReferenceEntry;
import org.junit.jupiter.api.Test;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

class PersistentCacheEntryTest {

    @Test
    void verify_serializeDeserialize() throws JsonProcessingException {
        var mapper = new ObjectMapper();

        var edr = EndpointDataReference.Builder.newInstance().
                endpoint("http://test.com")
                .id(randomUUID().toString())
                .authCode("11111")
                .authKey("authentication").build();

        var edrEntry = EndpointDataReferenceEntry.Builder.newInstance()
                .assetId(randomUUID().toString())
                .agreementId(randomUUID().toString())
                .transferProcessId(randomUUID().toString())
                .build();

        var serialized = mapper.writeValueAsString(new PersistentCacheEntry(edrEntry, edr));

        var deserialized = mapper.readValue(serialized, PersistentCacheEntry.class);

        assertThat(deserialized.getEdrEntry()).isNotNull();
        assertThat(deserialized.getEdr()).isNotNull();
    }


}
