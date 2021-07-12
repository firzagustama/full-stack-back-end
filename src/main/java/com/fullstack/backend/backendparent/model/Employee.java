
package com.fullstack.backend.backendparent.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author firzagustama
 * @version $Id: Employee.java, v 0.1 2021-07-10 20.14 firzagustama Exp $$
 */
@Entity
public class Employee implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = -5055214480219788410L;

    /** id */
    @Id
    private int id;

    /** companyId */
    private Integer companyId;

    /** name */
    private String name;

    /** gender */
    private String gender;

    /** birthPlace */
    private String birthPlace;

    /** bod */
    private Date bod;

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
     * Getter method for property companyId.
     *
     * @return property value of companyId
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Setter method for property companyId.
     *
     * @param companyId value to be assigned to property companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
     * Getter method for property gender.
     *
     * @return property value of gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter method for property gender.
     *
     * @param gender value to be assigned to property gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter method for property birthPlace.
     *
     * @return property value of birthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Setter method for property birthPlace.
     *
     * @param birthPlace value to be assigned to property birthPlace
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * Getter method for property bod.
     *
     * @return property value of bod
     */
    public Date getBod() {
        return bod;
    }

    /**
     * Setter method for property bod.
     *
     * @param bod value to be assigned to property bod
     */
    public void setBod(Date bod) {
        this.bod = bod;
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