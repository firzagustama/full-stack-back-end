
package com.fullstack.backend.backendparent.facade.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fullstack.backend.backendparent.util.domain.MoneyView;

import java.io.Serializable;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CarResponse.java, v 0.1 2021-07-10 21.36 firzagustama Exp $$
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarResponse implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 6190851861322043077L;

    /** id */
    private int id;

    /** name */
    private String name;

    /** brand */
    private String brand;

    /** price */
    private MoneyView price;

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
     * Getter method for property brand.
     *
     * @return property value of brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Setter method for property brand.
     *
     * @param brand value to be assigned to property brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter method for property price.
     *
     * @return property value of price
     */
    public MoneyView getPrice() {
        return price;
    }

    /**
     * Setter method for property price.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(MoneyView price) {
        this.price = price;
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