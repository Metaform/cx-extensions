package org.eclipse.tractusx.edc.dataplane.proxy.consumer.api.asset;

import jakarta.ws.rs.ClientErrorException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

/**
 * Maps client errors to return the associated status.
 */
@Provider
public class ClientErrorExceptionMapper implements ExceptionMapper<ClientErrorException> {

    public ClientErrorExceptionMapper() {
    }

    @Override
    public Response toResponse(ClientErrorException exception) {
        return Response.status(exception.getResponse().getStatus()).build();
    }
}


