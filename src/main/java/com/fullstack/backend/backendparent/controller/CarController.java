
package com.fullstack.backend.backendparent.controller;

import com.fullstack.backend.backendparent.facade.CarServiceFacade;
import com.fullstack.backend.backendparent.facade.request.CreateCarRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteCarRequest;
import com.fullstack.backend.backendparent.facade.request.GetCarPaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCarRequest;
import com.fullstack.backend.backendparent.facade.response.CreateCarResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteCarResponse;
import com.fullstack.backend.backendparent.facade.response.GetCarPaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateCarResponse;
import org.hibernate.sql.Delete;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author firzagustama
 * @version $Id: CarController.java, v 0.1 2021-07-10 22.09 firzagustama Exp $$
 */
@Controller
@RequestMapping(path = "/car")
public class CarController {

    @Autowired
    private CarServiceFacade carServiceFacade;

    @PostMapping(path = "/")
    @ResponseBody
    private GetCarPaginationResponse getCarPagination(@RequestBody GetCarPaginationRequest request) throws Exception {
        return carServiceFacade.getCarPagination(request);
    }

    @PostMapping(path = "/create")
    @ResponseBody
    private CreateCarResponse createCar(@RequestBody CreateCarRequest request) {
        return carServiceFacade.createCar(request);
    }

    @PostMapping(path = "/update")
    @ResponseBody
    private UpdateCarResponse updateCar(@RequestBody UpdateCarRequest request) {
        return carServiceFacade.updateCar(request);
    }

    @PostMapping(path = "/delete")
    @ResponseBody
    private DeleteCarResponse deleteCar(@RequestBody DeleteCarRequest request) {
        return carServiceFacade.deleteCar(request);
    }
}