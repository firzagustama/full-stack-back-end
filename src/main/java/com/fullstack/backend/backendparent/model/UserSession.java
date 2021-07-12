
package com.fullstack.backend.backendparent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author firzagustama
 * @version $Id: UserSession.java, v 0.1 2021-07-11 17.42 firzagustama Exp $$
 */
@Entity
public class UserSession implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = -192731378650167986L;

    /** id */
    @Id
    private String id;

    /** username */
    private String username;

    /** createDate */
    @Column(name = "created_date")
    private Date createDate;

    /** expireDate */
    @Column(name = "expired_date")
    private Date expireDate;

    /**
     * Getter method for property id.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

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
     * Getter method for property createDate.
     *
     * @return property value of createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Setter method for property createDate.
     *
     * @param createDate value to be assigned to property createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Getter method for property expireDate.
     *
     * @return property value of expireDate
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * Setter method for property expireDate.
     *
     * @param expireDate value to be assigned to property expireDate
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}