
package com.fullstack.backend.backendparent.service;

import com.fullstack.backend.backendparent.facade.request.BaseRequest;
import com.fullstack.backend.backendparent.facade.request.LoginRequest;
import com.fullstack.backend.backendparent.facade.request.RegisterRequest;
import com.fullstack.backend.backendparent.facade.response.BaseResponse;
import com.fullstack.backend.backendparent.facade.response.LoginResponse;
import com.fullstack.backend.backendparent.facade.response.RegisterResponse;

/**
 * @author firzagustama
 * @version $Id: UsersService.java, v 0.1 2021-07-10 23.51 firzagustama Exp $$
 */
public interface UserService {

    LoginResponse login(LoginRequest request);

    BaseResponse logout(BaseRequest request);

    RegisterResponse register(RegisterRequest request);

}
