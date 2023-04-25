package org.eclipse.tractusx.edc.dataplane.proxy.consumer.api.asset;

import jakarta.ws.rs.ClientErrorException;

import static jakarta.ws.rs.core.Response.Status.PRECONDITION_REQUIRED;

/**
 * Exception used to map a {@link jakarta.ws.rs.core.Response.Status#PRECONDITION_REQUIRED} response.
 */
public class PreconditionFailedException extends ClientErrorException {

    public PreconditionFailedException(String message) {
        super(message, PRECONDITION_REQUIRED);
    }
}
