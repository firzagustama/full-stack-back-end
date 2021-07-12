
package com.fullstack.backend.backendparent.facade.impl;

import com.fullstack.backend.backendparent.facade.UsersServiceFacade;
import com.fullstack.backend.backendparent.facade.request.BaseRequest;
import com.fullstack.backend.backendparent.facade.request.LoginRequest;
import com.fullstack.backend.backendparent.facade.request.RegisterRequest;
import com.fullstack.backend.backendparent.facade.response.BaseResponse;
import com.fullstack.backend.backendparent.facade.response.LoginResponse;
import com.fullstack.backend.backendparent.facade.response.RegisterResponse;
import com.fullstack.backend.backendparent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author firzagustama
 * @version $Id: UsersServiceFacadeImpl.java, v 0.1 2021-07-11 00.06 firzagustama Exp $$
 */
@Service
public class UsersServiceFacadeImpl implements UsersServiceFacade {

    @Autowired
    private UserService userService;

    @Override
    public LoginResponse login(LoginRequest request) {
        return userService.login(request);
    }

    @Override
    public BaseResponse logout(BaseRequest request) {
        return userService.logout(request);
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {
        return userService.register(request);
    }
}