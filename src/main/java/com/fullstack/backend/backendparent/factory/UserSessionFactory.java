/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All rights reserved.
 */

package com.fullstack.backend.backendparent.factory;

import com.fullstack.backend.backendparent.model.UserSession;

/**
 * @author firzagustama (muhammad.gustama@dana.id)
 * @version $Id: UserSessionFactory.java, v 0.1 2021-07-11 17.44 firzagustama Exp $$
 */
public interface UserSessionFactory {

    UserSession createUserSession(String username);

}
