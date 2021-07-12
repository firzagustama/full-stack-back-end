
package com.fullstack.backend.backendparent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author firzagustama
 * @version $Id: Users.java, v 0.1 2021-07-10 23.48 firzagustama Exp $$
 */
@Entity
public class User implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 3977729426774640062L;

    @Id
    /** username */
    private String username;

    /** email */
    private String email;

    @Column(name = "pass")
    /** password */
    private String password;

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

    /**
     * Getter method for property password.
     *
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property password.
     *
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}