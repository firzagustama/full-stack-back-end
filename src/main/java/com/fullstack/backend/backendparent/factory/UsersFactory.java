
package com.fullstack.backend.backendparent.factory;

import com.fullstack.backend.backendparent.facade.request.LoginRequest;
import com.fullstack.backend.backendparent.facade.request.RegisterRequest;
import com.fullstack.backend.backendparent.model.User;

/**
 * @author firzagustama
 * @version $Id: UsersFactory.java, v 0.1 2021-07-11 00.10 firzagustama Exp $$
 */
public interface UsersFactory {

    User getUser(RegisterRequest request);

    User getUser(LoginRequest request);

}
