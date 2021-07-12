
package com.fullstack.backend.backendparent.factory.impl;

import com.fullstack.backend.backendparent.facade.request.CreateCarRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCarRequest;
import com.fullstack.backend.backendparent.facade.response.CarResponse;
import com.fullstack.backend.backendparent.factory.CarFactory;
import com.fullstack.backend.backendparent.model.Car;
import com.fullstack.backend.backendparent.util.MoneyViewUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CarFactoryImpl.java, v 0.1 2021-07-10 22.26 firzagustama Exp $$
 */
@Service
public class CarFactoryImpl implements CarFactory {

    @Override
    public CarResponse getCarResponse(Car car) {
        CarResponse response = new CarResponse();
        response.setId(car.getId());
        response.setName(car.getName());
        response.setBrand(car.getBrand());
        response.setPrice(MoneyViewUtil.convertToMoneyView(car.getPrice()));
        return response;
    }

    @Override
    public List<CarResponse> getCarResponses(List<Car> cars) {
        List<CarResponse> response = new ArrayList<>();
        for (Car car : cars) {
            response.add(getCarResponse(car));
        }
        return response;
    }

    @Override
    public Car getCar(CreateCarRequest request) {
        Car car = new Car();
        car.setName(request.getName());
        car.setBrand(request.getBrand());
        car.setPrice(request.getPrice());
        return car;
    }

    @Override
    public Car getCar(UpdateCarRequest request) {
        Car car = new Car();
        car.setId(request.getId());
        car.setName(request.getName());
        car.setBrand(request.getBrand());
        car.setPrice(request.getPrice());
        return car;
    }
}