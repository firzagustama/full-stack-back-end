
package com.fullstack.backend.backendparent.facade.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CompanyResponse.java, v 0.1 2021-07-10 21.35 firzagustama Exp $$
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompanyResponse implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 2419449284970683691L;

    /** id */
    private int id;

    /** name */
    private String name;

    /** address */
    private String address;

    /** phoneNumber */
    private String phoneNumber;

    /** employees */
    private List<EmployeeResponse> employees;

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

    /**
     * Getter method for property employees.
     *
     * @return property value of employees
     */
    public List<EmployeeResponse> getEmployees() {
        return employees;
    }

    /**
     * Setter method for property employees.
     *
     * @param employees value to be assigned to property employees
     */
    public void setEmployees(List<EmployeeResponse> employees) {
        this.employees = employees;
    }
}