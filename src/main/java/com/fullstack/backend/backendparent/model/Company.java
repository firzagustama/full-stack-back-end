
package com.fullstack.backend.backendparent.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author firzagustama
 * @version $Id: Company.java, v 0.1 2021-07-10 20.16 firzagustama Exp $$
 */
@Entity
public class Company implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = -6358262006980396920L;

    /** id */
    @Id
    private int id;

    /** name */
    private String name;

    /** address */
    private String address;

    /** phoneNumber */
    private String phoneNumber;

    /**
     * Getter method for property id.
     *
     * @return property value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter method for property name.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property name.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property address.
     *
     * @return property value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for property address.
     *
     * @param address value to be assigned to property address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter method for property phoneNumber.
     *
     * @return property value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter method for property phoneNumber.
     *
     * @param phoneNumber value to be assigned to property phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}