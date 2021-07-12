
package com.fullstack.backend.backendparent.util;

import java.io.Serializable;

/**
 * @author firzagustama
 * @version $Id: ContextHolder.java, v 0.1 2021-07-11 21.06 firzagustama Exp $$
 */
public class ContextHolder implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 5631791620018480756L;

    /** sessionKey */
    private static String sessionKey;

    /** username */
    private static String loginUsername;

    /**
     * Getter method for property sessionKey.
     *
     * @return property value of sessionKey
     */
    public static String getSessionKey() {
        return sessionKey;
    }

    /**
     * Setter method for property sessionKey.
     *
     * @param sessionKey value to be assigned to property sessionKey
     */
    public static void setSessionKey(String sessionKey) {
        ContextHolder.sessionKey = sessionKey;
    }

    /**
     * Getter method for property loginUsername.
     *
     * @return property value of loginUsername
     */
    public static String getLoginUsername() {
        return loginUsername;
    }

    /**
     * Setter method for property loginUsername.
     *
     * @param loginUsername value to be assigned to property loginUsername
     */
    public static void setLoginUsername(String loginUsername) {
        ContextHolder.loginUsername = loginUsername;
    }
}