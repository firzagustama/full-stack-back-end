
package com.fullstack.backend.backendparent.service;

import com.fullstack.backend.backendparent.facade.request.CreateCarRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteCarRequest;
import com.fullstack.backend.backendparent.facade.request.GetCarPaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCarRequest;
import com.fullstack.backend.backendparent.facade.response.CreateCarResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteCarResponse;
import com.fullstack.backend.backendparent.facade.response.GetCarPaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateCarResponse;

/**
 * @author firzagustama
 * @version $Id: CarService.java, v 0.1 2021-07-10 22.32 firzagustama Exp $$
 */
public interface CarService {

    GetCarPaginationResponse getCarPagination(GetCarPaginationRequest request) throws Exception;

    CreateCarResponse createCar(CreateCarRequest request);

    UpdateCarResponse updateCar(UpdateCarRequest request);

    DeleteCarResponse deleteCar(DeleteCarRequest request);

}
