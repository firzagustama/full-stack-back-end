
package com.fullstack.backend.backendparent.service.impl;

import com.fullstack.backend.backendparent.enums.ErrorEnum;
import com.fullstack.backend.backendparent.factory.UserSessionFactory;
import com.fullstack.backend.backendparent.model.UserSession;
import com.fullstack.backend.backendparent.repository.UserSessionRepository;
import com.fullstack.backend.backendparent.service.UserSessionService;
import com.fullstack.backend.backendparent.util.exception.SessionExpireException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author firzagustama
 * @version $Id: UserSessionServiceImpl.java, v 0.1 2021-07-11 18.00 firzagustama Exp $$
 */
@Service
public class UserSessionServiceImpl implements UserSessionService {

    /** userSessionFactory */
    @Autowired
    private UserSessionFactory userSessionFactory;

    /** userSessionRepository */
    @Autowired
    private UserSessionRepository userSessionRepository;

    @Override
    public UserSession checkValidSession(String sessionKey) {
        if (sessionKey == null || sessionKey.equals("")) {
            throw new SessionExpireException(ErrorEnum.SESSION_EXPIRED.getErrorCode());
        }
        UserSession userSession = userSessionRepository.findById(sessionKey)
                .orElseThrow(() -> new SessionExpireException(ErrorEnum.SESSION_EXPIRED.getErrorCode()));
        if (userSession.getExpireDate().before(new Date())) {
            throw new SessionExpireException(ErrorEnum.SESSION_EXPIRED.getErrorCode());
        }

        return userSession;
    }

    @Override
    public String createSession(String username) {
        UserSession userSession = userSessionFactory.createUserSession(username);
        userSessionRepository.save(userSession);
        return userSession.getId();
    }

    @Override
    public void deleteSession(String sessionKey) {
        userSessionRepository.deleteById(sessionKey);
    }
}