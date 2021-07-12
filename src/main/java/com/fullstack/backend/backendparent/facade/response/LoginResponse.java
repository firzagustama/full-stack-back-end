
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: LoginResponse.java, v 0.1 2021-07-10 23.56 firzagustama Exp $$
 */
public class LoginResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 2870284413414259644L;

    /** username */
    private String username;

    /** email */
    private String email;

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

    /**
     * Getter method for property email.
     *
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property email.
     *
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}