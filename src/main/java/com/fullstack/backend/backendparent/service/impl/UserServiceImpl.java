
package com.fullstack.backend.backendparent.service.impl;

import com.fullstack.backend.backendparent.enums.ErrorEnum;
import com.fullstack.backend.backendparent.facade.request.BaseRequest;
import com.fullstack.backend.backendparent.facade.request.LoginRequest;
import com.fullstack.backend.backendparent.facade.request.RegisterRequest;
import com.fullstack.backend.backendparent.facade.response.BaseResponse;
import com.fullstack.backend.backendparent.facade.response.LoginResponse;
import com.fullstack.backend.backendparent.facade.response.RegisterResponse;
import com.fullstack.backend.backendparent.factory.UsersFactory;
import com.fullstack.backend.backendparent.model.User;
import com.fullstack.backend.backendparent.repository.UserRepository;
import com.fullstack.backend.backendparent.service.UserService;
import com.fullstack.backend.backendparent.service.UserSessionService;
import com.fullstack.backend.backendparent.util.ContextHolder;
import com.fullstack.backend.backendparent.util.ParamCheckHelper;
import com.fullstack.backend.backendparent.util.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author firzagustama
 * @version $Id: UsersServiceImpl.java, v 0.1 2021-07-11 00.02 firzagustama Exp $$
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersFactory userFactory;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserSessionService userSessionService;

    @Override
    public LoginResponse login(LoginRequest request) {
        LoginResponse response = new LoginResponse();
        // paramter check
        ParamCheckHelper.isNotEitherBlank(request.getUsername(), "username", request.getEmail(), "email");
        ParamCheckHelper.isNotBlank(request.getPassword(), "password");

        // compose request user and get user to db
        User user = userFactory.getUser(request);
        Optional<User> userDB = request.getUsername() != null ?
                userRepository.findById(request.getUsername()) :
                userRepository.findByEmail(request.getEmail());

        // check password
        if (!userDB.isPresent()) {
            throw new BaseException(ErrorEnum.USER_NOT_EXISTS.getErrorCode());
        } else if (!user.getPassword().equals(userDB.get().getPassword())) {
            throw new BaseException(ErrorEnum.PASSWORD_NOT_MATCH.getErrorCode());
        }

        // compose response
        response.setSuccess(true);
        response.setUsername(userDB.get().getUsername());
        response.setEmail(userDB.get().getEmail());
        return response;
    }

    @Override
    public BaseResponse logout(BaseRequest request) {
        // check
        ParamCheckHelper.isNotBlank(ContextHolder.getSessionKey(), "sessionKey");

        // delete session
        userSessionService.deleteSession(ContextHolder.getSessionKey());

        // logic
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        return response;
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {
        RegisterResponse response = new RegisterResponse();

        // parameter check
        ParamCheckHelper.isNotBlank(request.getUsername(), "username");
        ParamCheckHelper.isNotBlank(request.getEmail(), "email");
        ParamCheckHelper.isNotBlank(request.getPassword(), "password");

        // check if user exist in db
        if (userRepository.findById(request.getUsername()).isPresent()) {
            throw new BaseException(ErrorEnum.USERNAME_EXISTS.getErrorCode());
        } else if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new BaseException(ErrorEnum.EMAIL_EXISTS.getErrorCode());
        }

        // add user to db
        User user = userFactory.getUser(request);
        userRepository.save(user);

        // compose response
        response.setSuccess(true);
        response.setUsername(user.getUsername());
        return response;
    }
}