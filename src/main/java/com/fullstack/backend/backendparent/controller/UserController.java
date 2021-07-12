
package com.fullstack.backend.backendparent.controller;

import com.fullstack.backend.backendparent.facade.UsersServiceFacade;
import com.fullstack.backend.backendparent.facade.request.BaseRequest;
import com.fullstack.backend.backendparent.facade.request.LoginRequest;
import com.fullstack.backend.backendparent.facade.request.RegisterRequest;
import com.fullstack.backend.backendparent.facade.response.BaseResponse;
import com.fullstack.backend.backendparent.facade.response.LoginResponse;
import com.fullstack.backend.backendparent.facade.response.RegisterResponse;
import com.fullstack.backend.backendparent.service.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author firzagustama
 * @version $Id: UserController.java, v 0.1 2021-07-11 00.51 firzagustama Exp $$
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UsersServiceFacade usersServiceFacade;

    @Autowired
    private UserSessionService userSessionService;

    @PostMapping(path = "/register")
    private ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request, HttpServletResponse servletResponse) {
        RegisterResponse registerResponse = usersServiceFacade.register(request);

        // set session and cookie
        String sessionKey = userSessionService.createSession(registerResponse.getUsername());
        Cookie cookie = new Cookie("session", sessionKey);
        cookie.setMaxAge(3600);
        cookie.setHttpOnly(true);
        servletResponse.addCookie(cookie);
        servletResponse.addHeader("session", cookie.getValue());

        // compose response entity
        return new ResponseEntity<>(registerResponse, HttpStatus.OK);
    }

    @PostMapping(path = "/logout")
    @ResponseBody
    private BaseResponse logout(@RequestBody BaseRequest request) {
        return usersServiceFacade.logout(request);
    }

    @PostMapping(path = "/login")
    private ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request, HttpServletResponse servletResponse) {
        LoginResponse loginResponse = usersServiceFacade.login(request);

        // set session and cookie
        String sessionKey = userSessionService.createSession(loginResponse.getUsername());
        Cookie cookie = new Cookie("session", sessionKey);
        cookie.setMaxAge(3600);
        cookie.setHttpOnly(true);
        servletResponse.addCookie(cookie);
        servletResponse.addHeader("session", cookie.getValue());

        // compose response entity
        return new ResponseEntity<>(loginResponse, HttpStatus.OK);
    }
}