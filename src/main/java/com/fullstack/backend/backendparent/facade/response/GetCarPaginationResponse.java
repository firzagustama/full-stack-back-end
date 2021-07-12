
package com.fullstack.backend.backendparent.facade.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: GetCarPaginationResponse.java, v 0.1 2021-07-10 22.10 firzagustama Exp $$
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCarPaginationResponse extends BasePaginationResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 6379122778180708435L;

    /** cars */
    private List<CarResponse> cars;

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