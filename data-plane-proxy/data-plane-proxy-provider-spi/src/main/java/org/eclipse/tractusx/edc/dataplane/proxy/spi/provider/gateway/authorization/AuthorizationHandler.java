package org.eclipse.tractusx.edc.dataplane.proxy.spi.provider.gateway.authorization;

import org.eclipse.edc.spi.result.Result;

/**
 * Performs an authorization using the request token for a given path. Implementation support different token formats such as JWT.
 */
@FunctionalInterface
public interface AuthorizationHandler {

    /**
     * Performs the authorization check.
     *
     * @param token the unvalidated token
     * @param path the request alias path, not the dereferenced proxied path
     */
    Result<Void> authorize(String token, String path);

}
