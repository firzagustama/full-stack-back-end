
package com.fullstack.backend.backendparent.service;

import com.fullstack.backend.backendparent.model.UserSession;

/**
 * @author firzagustama
 * @version $Id: UserSessionService.java, v 0.1 2021-07-11 17.59 firzagustama Exp $$
 */
public interface UserSessionService {

    UserSession checkValidSession(String sessionKey);

    String createSession(String username);

    void deleteSession(String sessionKey);

}
