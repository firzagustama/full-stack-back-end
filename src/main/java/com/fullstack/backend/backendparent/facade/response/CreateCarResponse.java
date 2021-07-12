
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: CreateCarResponse.java, v 0.1 2021-07-12 20.27 firzagustama Exp $$
 */
public class CreateCarResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 6270747729315638751L;

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