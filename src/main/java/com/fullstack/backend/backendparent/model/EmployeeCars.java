
package com.fullstack.backend.backendparent.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

/**
 * @author firzagustama
 * @version $Id: EmployeeCars.java, v 0.1 2021-07-10 20.17 firzagustama Exp $$
 */
@Entity
@IdClass(EmployeeCarsId.class)
public class EmployeeCars implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 5318660320160790751L;

    /** employeeId */
    @Id
    private int employeeId;

    /** carId */
    @Id
    private int carId;

    /**
     * Getter method for property employeeId.
     *
     * @return property value of employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Setter method for property employeeId.
     *
     * @param employeeId value to be assigned to property employeeId
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Getter method for property carId.
     *
     * @return property value of carId
     */
    public int getCarId() {
        return carId;
    }

    /**
     * Setter method for property carId.
     *
     * @param carId value to be assigned to property carId
     */
    public void setCarId(int carId) {
        this.carId = carId;
    }
}