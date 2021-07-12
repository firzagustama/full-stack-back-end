
package com.fullstack.backend.backendparent.service.impl;

import com.fullstack.backend.backendparent.enums.ErrorEnum;
import com.fullstack.backend.backendparent.facade.request.CreateCarRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteCarRequest;
import com.fullstack.backend.backendparent.facade.request.GetCarPaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCarRequest;
import com.fullstack.backend.backendparent.facade.response.CreateCarResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteCarResponse;
import com.fullstack.backend.backendparent.facade.response.GetCarPaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateCarResponse;
import com.fullstack.backend.backendparent.factory.CarFactory;
import com.fullstack.backend.backendparent.model.Car;
import com.fullstack.backend.backendparent.repository.CarRepository;
import com.fullstack.backend.backendparent.service.CarService;
import com.fullstack.backend.backendparent.util.ParamCheckHelper;
import com.fullstack.backend.backendparent.util.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CarServiceImpl.java, v 0.1 2021-07-10 22.33 firzagustama Exp $$
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarFactory carFactory;

    @Autowired
    private CarRepository carRepository;

    @Override
    public GetCarPaginationResponse getCarPagination(GetCarPaginationRequest request) throws Exception {
        GetCarPaginationResponse response = new GetCarPaginationResponse();

        // set pagination
        int page = request.getPage(), size = request.getSize();
        Pageable pageable = PageRequest.of(page, size);

        // query to repository
        long count = carRepository.count();
        List<Car> cars = carRepository.findAll(pageable);

        // compose response
        response.setCars(carFactory.getCarResponses(cars));
        response.setHasMore(count > (long) (page + 1) * size);
        response.setSuccess(true);
        response.setCount(count);
        return response;
    }

    @Override
    public CreateCarResponse createCar(CreateCarRequest request) {
        CreateCarResponse response = new CreateCarResponse();

        Car car = carRepository.save(carFactory.getCar(request));

        // compose response
        response.setSuccess(true);
        response.setCar(carFactory.getCarResponse(car));
        return response;
    }

    @Override
    public UpdateCarResponse updateCar(UpdateCarRequest request) {
        UpdateCarResponse response = new UpdateCarResponse();

        carRepository.findById(request.getId())
                .orElseThrow(() -> new BaseException(ErrorEnum.UPDATE_DATA_NOT_EXISTS.getErrorCode()));
        Car car = carRepository.save(carFactory.getCar(request));

        // compose response
        response.setSuccess(true);
        response.setCar(carFactory.getCarResponse(car));
        return response;
    }

    @Override
    public DeleteCarResponse deleteCar(DeleteCarRequest request) {
        DeleteCarResponse response = new DeleteCarResponse();

        ParamCheckHelper.isNotNull(request.getId(), "id");
        carRepository.deleteById(request.getId());

        response.setSuccess(true);
        response.setId(request.getId());
        return response;
    }
}