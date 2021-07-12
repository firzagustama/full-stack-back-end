
package com.fullstack.backend.backendparent.facade;

import com.fullstack.backend.backendparent.facade.request.BaseRequest;
import com.fullstack.backend.backendparent.facade.request.LoginRequest;
import com.fullstack.backend.backendparent.facade.request.RegisterRequest;
import com.fullstack.backend.backendparent.facade.response.BaseResponse;
import com.fullstack.backend.backendparent.facade.response.LoginResponse;
import com.fullstack.backend.backendparent.facade.response.RegisterResponse;

/**
 * @author firzagustama
 * @version $Id: UsersServiceFacade.java, v 0.1 2021-07-11 00.04 firzagustama Exp $$
 */
public interface UsersServiceFacade {

    LoginResponse login(LoginRequest request);

    BaseResponse logout(BaseRequest request);

    RegisterResponse register(RegisterRequest request);

}
