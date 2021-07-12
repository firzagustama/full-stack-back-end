
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: RegisterResponse.java, v 0.1 2021-07-11 00.05 firzagustama Exp $$
 */
public class RegisterResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = -7684340051578449252L;

    /** username */
    private String username;

    /**
     * Getter method for property username.
     *
     * @return property value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for property username.
     *
     * @param username value to be assigned to property username
     */
    public void setUsername(String username) {
        this.username = username;
    }
}