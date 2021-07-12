
package com.fullstack.backend.backendparent.util.exception;

/**
 * @author firzagustama
 * @version $Id: SessionExpireException.java, v 0.1 2021-07-11 18.06 firzagustama Exp $$
 */
public class SessionExpireException extends BaseException {

    /**
     * Default Constructor
     * @param errorCode
     */
    public SessionExpireException(String errorCode) {
        super(errorCode);
    }
}