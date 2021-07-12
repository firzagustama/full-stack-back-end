
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama (muhammad.gustama@dana.id)
 * @version $Id: UpdateCarResponse.java, v 0.1 2021-07-12 20.29 firzagustama Exp $$
 */
public class UpdateCarResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = -6490470895707203931L;

    /** car */
    private CarResponse car;

    /**
     * Getter method for property car.
     *
     * @return property value of car
     */
    public CarResponse getCar() {
        return car;
    }

    /**
     * Setter method for property car.
     *
     * @param car value to be assigned to property car
     */
    public void setCar(CarResponse car) {
        this.car = car;
    }
}