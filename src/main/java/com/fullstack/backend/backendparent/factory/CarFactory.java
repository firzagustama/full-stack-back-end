
package com.fullstack.backend.backendparent.factory;

import com.fullstack.backend.backendparent.facade.request.CreateCarRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCarRequest;
import com.fullstack.backend.backendparent.facade.response.CarResponse;
import com.fullstack.backend.backendparent.model.Car;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CarFactory.java, v 0.1 2021-07-10 22.26 firzagustama Exp $$
 */
public interface CarFactory {

    CarResponse getCarResponse(Car car);

    List<CarResponse> getCarResponses(List<Car> cars);

    Car getCar(CreateCarRequest request);

    Car getCar(UpdateCarRequest request);

}
