
package com.fullstack.backend.backendparent.facade.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: EmployeeResponse.java, v 0.1 2021-07-10 20.37 firzagustama Exp $$
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse implements Serializable{
    /** serialVersionUID */
    private static final long serialVersionUID = -84257211515597467L;

    /** id */
    private int id;

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

    /** company */
    private CompanyResponse company;

    /** cars */
    private List<CarResponse> cars;

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
     * Getter method for property company.
     *
     * @return property value of company
     */
    public CompanyResponse getCompany() {
        return company;
    }

    /**
     * Setter method for property company.
     *
     * @param company value to be assigned to property company
     */
    public void setCompany(CompanyResponse company) {
        this.company = company;
    }

    /**
     * Getter method for property cars.
     *
     * @return property value of cars
     */
    public List<CarResponse> getCars() {
        return cars;
    }

    /**
     * Setter method for property cars.
     *
     * @param cars value to be assigned to property cars
     */
    public void setCars(List<CarResponse> cars) {
        this.cars = cars;
    }
}