
package com.fullstack.backend.backendparent.facade.impl;

import com.fullstack.backend.backendparent.facade.CarServiceFacade;
import com.fullstack.backend.backendparent.facade.request.CreateCarRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteCarRequest;
import com.fullstack.backend.backendparent.facade.request.GetCarPaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCarRequest;
import com.fullstack.backend.backendparent.facade.response.CreateCarResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteCarResponse;
import com.fullstack.backend.backendparent.facade.response.GetCarPaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateCarResponse;
import com.fullstack.backend.backendparent.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author firzagustama
 * @version $Id: CarServiceFacadeImpl.java, v 0.1 2021-07-10 22.25 firzagustama Exp $$
 */
@Service
public class CarServiceFacadeImpl implements CarServiceFacade {

    @Autowired
    private CarService carService;

    @Override
    public GetCarPaginationResponse getCarPagination(GetCarPaginationRequest request) throws Exception {
        return carService.getCarPagination(request);
    }

    @Override
    public CreateCarResponse createCar(CreateCarRequest request) {
        return carService.createCar(request);
    }

    @Override
    public UpdateCarResponse updateCar(UpdateCarRequest request) {
        return carService.updateCar(request);
    }

    @Override
    public DeleteCarResponse deleteCar(DeleteCarRequest request) {
        return carService.deleteCar(request);
    }
}