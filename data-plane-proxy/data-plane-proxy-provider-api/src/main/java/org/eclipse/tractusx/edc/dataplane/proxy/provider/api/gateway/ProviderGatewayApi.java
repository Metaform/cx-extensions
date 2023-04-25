package org.eclipse.tractusx.edc.dataplane.proxy.provider.api.gateway;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.ws.rs.container.AsyncResponse;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.Suspended;
import jakarta.ws.rs.core.Context;

/**
 * Open API definition.
 */
@OpenAPIDefinition
@Tag(name = "Data Plane Proxy API")
public interface ProviderGatewayApi {

    @Operation(responses = {
            @ApiResponse(content = @Content(mediaType = "application/json"), description = "Gets asset data")
    })
    void requestAsset(@Context ContainerRequestContext context, @Suspended AsyncResponse response);
}
