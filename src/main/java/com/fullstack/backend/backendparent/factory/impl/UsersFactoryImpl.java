
package com.fullstack.backend.backendparent.factory.impl;

import com.fullstack.backend.backendparent.facade.request.LoginRequest;
import com.fullstack.backend.backendparent.facade.request.RegisterRequest;
import com.fullstack.backend.backendparent.factory.UsersFactory;
import com.fullstack.backend.backendparent.model.User;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @author firzagustama
 * @version $Id: UsersFactoryImpl.java, v 0.1 2021-07-11 00.10 firzagustama Exp $$
 */
@Service
public class UsersFactoryImpl implements UsersFactory {

    @Override
    public User getUser(RegisterRequest request) {
        byte[] md5 = DigestUtils.md5Digest(request.getPassword().getBytes());

        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(new String(md5));
        return user;
    }

    @Override
    public User getUser(LoginRequest request) {
        byte[] md5 = DigestUtils.md5Digest(request.getPassword().getBytes());

        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(new String(md5));
        return user;
    }
}