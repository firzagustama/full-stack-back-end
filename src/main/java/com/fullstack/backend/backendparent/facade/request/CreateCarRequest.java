
package com.fullstack.backend.backendparent.facade.request;

/**
 * @author firzagustama
 * @version $Id: CreateCarRequest.java, v 0.1 2021-07-12 20.25 firzagustama Exp $$
 */
public class CreateCarRequest extends BaseRequest {
    /** serialVersionUID */
    private static final long serialVersionUID = 8717542021211900324L;

    /** name */
    private String name;

    /** brand */
    private String brand;

    /** price */
    private double price;


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
    public double getPrice() {
        return price;
    }

    /**
     * Setter method for property price.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}