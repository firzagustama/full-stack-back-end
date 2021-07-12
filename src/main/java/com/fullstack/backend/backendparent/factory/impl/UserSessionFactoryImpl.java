
package com.fullstack.backend.backendparent.factory.impl;

import com.fullstack.backend.backendparent.enums.ErrorEnum;
import com.fullstack.backend.backendparent.factory.UserSessionFactory;
import com.fullstack.backend.backendparent.model.UserSession;
import com.fullstack.backend.backendparent.util.exception.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;

/**
 * @author firzagustama
 * @version $Id: UserSessionFactoryImpl.java, v 0.1 2021-07-11 17.50 firzagustama Exp $$
 */
@Service
public class UserSessionFactoryImpl implements UserSessionFactory {

    /** LOGGER */
    private Logger LOGGER = LoggerFactory.getLogger(UserSessionFactoryImpl.class);

    /** session expiry time */
    private final int SESSION_EXPIRE_TIME = 3600; // 1 hour

    @Override
    public UserSession createUserSession(String username) {
        Calendar calendar = Calendar.getInstance();
        Date createDate = calendar.getTime();
        calendar.add(Calendar.SECOND, SESSION_EXPIRE_TIME);
        Date expireDate = calendar.getTime();

        String plainKey = username + createDate.toString();
        String sessionKey = createSessionKey(plainKey);

        UserSession userSession = new UserSession();
        userSession.setId(sessionKey);
        userSession.setUsername(username);
        userSession.setCreateDate(createDate);
        userSession.setExpireDate(expireDate);
        return userSession;
    }

    /**
     * hash plainKey
     * @param plainKey
     * @return
     */
    private String createSessionKey(String plainKey) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] hash = md.digest(plainKey.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                String conversion = Integer.toString(b & 0xFF,16);
                while (conversion.length() < 2) {
                    conversion = "0" + conversion;
                }
                sb.append(conversion);
            }

            return sb.toString();
        } catch (Exception e) {
            LOGGER.info("fail to get hash instance");
            throw new BaseException(ErrorEnum.UNEXPECTED_ERROR.getErrorCode());
        }
    }
}