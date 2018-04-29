package games.medrick.medrickestan.api.exception;

import games.medrick.medrickestan.core.exception.BaseException;

/**
 * created by Behrooz Bahrame on 2/17/2018
 **/

public class AuthorizationException extends BaseException {
    public AuthorizationException() {
        super("ACCESS_DENIED");
    }
}
