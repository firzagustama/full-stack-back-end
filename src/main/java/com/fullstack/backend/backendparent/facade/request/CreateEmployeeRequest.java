
package com.fullstack.backend.backendparent.facade.request;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CreateEmployeeRequest.java, v 0.1 2021-07-12 19.48 firzagustama Exp $$
 */
public class CreateEmployeeRequest extends BaseRequest {
    /** serialVersionUID */
    private static final long serialVersionUID = 436089142530211172L;

    /** name */
    private String name;

    /** gender */
    private String gender;

    /** birthPlace */
    private String birthPlace;

    /** bod */
    private String bod;

    /** address */
    private String address;

    /** phoneNumber */
    private String phoneNumber;

    /** companyId */
    private Integer companyId;

    /** carIds */
    private List<Integer> carIds;

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
    public String getBod() {
        return bod;
    }

    /**
     * Setter method for property bod.
     *
     * @param bod value to be assigned to property bod
     */
    public void setBod(String bod) {
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
     * Getter method for property carIds.
     *
     * @return property value of carIds
     */
    public List<Integer> getCarIds() {
        return carIds;
    }

    /**
     * Setter method for property carIds.
     *
     * @param carIds value to be assigned to property carIds
     */
    public void setCarIds(List<Integer> carIds) {
        this.carIds = carIds;
    }
}