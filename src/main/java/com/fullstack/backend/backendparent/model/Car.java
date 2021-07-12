
package com.fullstack.backend.backendparent.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author firzagustama
 * @version $Id: Car.java, v 0.1 2021-07-10 20.16 firzagustama Exp $$
 */
@Entity
public class Car implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 8841518698722009514L;

    /** id */
    @Id
    private int id;

    /** name */
    private String name;

    /** brand */
    private String brand;

    /** price */
    private double price;


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