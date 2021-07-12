
package com.fullstack.backend.backendparent.filter;

import com.fullstack.backend.backendparent.model.UserSession;
import com.fullstack.backend.backendparent.service.UserSessionService;
import com.fullstack.backend.backendparent.util.ContextHolder;
import com.fullstack.backend.backendparent.util.exception.SessionExpireException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author firzagustama
 * @version $Id: SessionCommonFilter.java, v 0.1 2021-07-11 20.27 firzagustama Exp $$
 */
@Order(1)
public class SessionCommonFilter implements Filter {

    /** LOGGER */
    private final Logger LOGGER = LoggerFactory.getLogger(SessionCommonFilter.class);

    /** userSessionService */
    private UserSessionService userSessionService;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // get sessionKey from request header
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // skip preflight request
        if ("OPTIONS".equals(request.getMethod())) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        String session = "";

        // get from cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("session")) {
                    session = cookie.getValue();
                    break;
                }
            }
        } else {
            session = request.getHeader("authorization");
        }

        // check session is valid or not
        UserSession userSession;
        try {
            userSession = userSessionService.checkValidSession(session);
        } catch (SessionExpireException e) {
            LOGGER.warn("Session failed");
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Session Expire");
            return;
        }

        // add to ContextHolder
        ContextHolder.setSessionKey(userSession.getId());
        ContextHolder.setLoginUsername(userSession.getUsername());

        // do filter
        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
     * Setter method for property userSessionService.
     *
     * @param userSessionService value to be assigned to property userSessionService
     */
    public void setUserSessionService(UserSessionService userSessionService) {
        this.userSessionService = userSessionService;
    }
}