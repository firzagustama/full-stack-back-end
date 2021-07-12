
package com.fullstack.backend.backendparent.model;

import java.io.Serializable;

/**
 * @author firzagustama
 * @version $Id: EmployeeCarsId.java, v 0.1 2021-07-10 21.13 firzagustama Exp $$
 */
public class EmployeeCarsId implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = -2957886886851105251L;

    /** employeeId */
    private int employeeId;

    /** carId */
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