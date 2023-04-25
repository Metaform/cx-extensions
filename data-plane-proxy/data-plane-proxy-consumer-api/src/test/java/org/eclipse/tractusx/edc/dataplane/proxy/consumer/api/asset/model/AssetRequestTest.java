package org.eclipse.tractusx.edc.dataplane.proxy.consumer.api.asset.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AssetRequestTest {

    @Test
    void verify_SerializeDeserialize() throws JsonProcessingException {
        var mapper = new ObjectMapper();

        var request = AssetRequest.Builder.newInstance().assetId("asset1").endpointUrl("https://test.com").transferProcessId("tp1").build();
        var serialized = mapper.writeValueAsString(request);

        var deserialized = mapper.readValue(serialized, AssetRequest.class);

        assertThat(deserialized.getAssetId()).isEqualTo(request.getAssetId());
        assertThat(deserialized.getTransferProcessId()).isEqualTo(request.getTransferProcessId());
        assertThat(deserialized.getEndpointUrl()).isEqualTo(request.getEndpointUrl());
    }

    @Test
    void verify_NullArguments() {
        assertThatThrownBy(() -> AssetRequest.Builder.newInstance().endpointUrl("https://test.com").build()).isInstanceOf(NullPointerException.class);
        assertThatThrownBy(() -> AssetRequest.Builder.newInstance().assetId("asset1").build()).isInstanceOf(NullPointerException.class);
    }

    @Test
    void verify_AssetIdOrTransferProcessId() {
        AssetRequest.Builder.newInstance().assetId("asset1").endpointUrl("https://test.com").build();
        AssetRequest.Builder.newInstance().transferProcessId("tp1").endpointUrl("https://test.com").build();
    }
}
