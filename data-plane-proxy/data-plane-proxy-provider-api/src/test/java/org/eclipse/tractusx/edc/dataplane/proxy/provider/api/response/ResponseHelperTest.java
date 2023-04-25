package org.eclipse.tractusx.edc.dataplane.proxy.provider.api.response;

import org.junit.jupiter.api.Test;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;
import static jakarta.ws.rs.core.MediaType.TEXT_PLAIN_TYPE;
import static jakarta.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static org.assertj.core.api.Assertions.assertThat;
import static org.eclipse.tractusx.edc.dataplane.proxy.provider.api.response.ResponseHelper.createMessageResponse;

class ResponseHelperTest {

    @Test
    void verify_responses() {
        assertThat(createMessageResponse(INTERNAL_SERVER_ERROR, "Some error", APPLICATION_JSON_TYPE).getEntity()).isEqualTo("'Some error'");
        assertThat(createMessageResponse(INTERNAL_SERVER_ERROR, "Some error", TEXT_PLAIN_TYPE).getEntity()).isEqualTo("Some error");
    }
}
