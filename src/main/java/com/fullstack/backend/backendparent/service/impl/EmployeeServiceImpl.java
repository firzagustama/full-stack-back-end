
package com.fullstack.backend.backendparent.service.impl;

import com.fullstack.backend.backendparent.enums.ErrorEnum;
import com.fullstack.backend.backendparent.facade.request.CreateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.GetEmployeePaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.response.CreateEmployeeResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteEmployeeResponse;
import com.fullstack.backend.backendparent.facade.response.GetEmployeePaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateEmployeeResponse;
import com.fullstack.backend.backendparent.factory.EmployeeFactory;
import com.fullstack.backend.backendparent.model.Employee;
import com.fullstack.backend.backendparent.model.EmployeeCars;
import com.fullstack.backend.backendparent.repository.EmployeeCarsRepository;
import com.fullstack.backend.backendparent.repository.EmployeeRepository;
import com.fullstack.backend.backendparent.service.EmployeeService;
import com.fullstack.backend.backendparent.util.ParamCheckHelper;
import com.fullstack.backend.backendparent.util.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: EmployeeServiceImpl.java, v 0.1 2021-07-10 20.35 firzagustama Exp $$
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    /** repository */
    @Autowired
    private EmployeeRepository employeeRepository;

    /** employeCarsRepository */
    @Autowired
    private EmployeeCarsRepository employeeCarsRepository;

    /** factory */
    @Autowired
    private EmployeeFactory employeeFactory;

    @Override
    public GetEmployeePaginationResponse getEmployeePagination(GetEmployeePaginationRequest request) {
        GetEmployeePaginationResponse response = new GetEmployeePaginationResponse();

        // set pagination
        int page = request.getPage(), size = request.getSize();
        Pageable pageable = PageRequest.of(page, size);

        // get to repository and count all
        long countAll = employeeRepository.count();
        List<Employee> employees = employeeRepository.findAll(pageable);

        // compose response
        response.setCount(countAll);
        response.setHasMore(countAll > (long) (page+1) * size);
        response.setEmployees(employeeFactory.getEmployees(employees));
        response.setSuccess(true);
        return response;
    }

    @Override
    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest request) {
        CreateEmployeeResponse response = new CreateEmployeeResponse();

        // insert into db
        Employee employee = employeeFactory.getEmployee(request);
        Employee savedEmployee = employeeRepository.save(employee);
        insertEmployeeCars(request.getCarIds(), savedEmployee.getId());

        // compose response
        response.setSuccess(true);
        response.setEmployee(employeeFactory.getEmployee(savedEmployee));
        return response;
    }

    @Override
    public UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest request) {
        UpdateEmployeeResponse response = new UpdateEmployeeResponse();

        // findById throw user not exist if null
        employeeRepository.findById(request.getId())
                .orElseThrow(() -> new BaseException(ErrorEnum.UPDATE_DATA_NOT_EXISTS.getErrorCode()));

        // update db
        Employee updatedEmployee = employeeFactory.getEmployee(request);
        employeeRepository.save(updatedEmployee);
        insertEmployeeCars(request.getCarIds(), updatedEmployee.getId());

        // compose response
        response.setSuccess(true);
        response.setEmployee(employeeFactory.getEmployee(updatedEmployee));
        return response;
    }

    @Override
    public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request) {
        DeleteEmployeeResponse response = new DeleteEmployeeResponse();

        // param check
        ParamCheckHelper.isNotNull(request.getId(), "id");

        // delete from db
        employeeRepository.deleteById(request.getId());

        // compose response
        response.setSuccess(true);
        response.setId(request.getId());
        return response;
    }

    /**
     * insertEmployeeCars to db
     * @param carIds
     * @param employeeId
     */
    private void insertEmployeeCars(List<Integer> carIds, int employeeId) {
        if (carIds == null || carIds.isEmpty()) {
            return;
        }

        List<EmployeeCars> employeeCars = new ArrayList<>();
        for (Integer carId : carIds) {
            EmployeeCars ec = new EmployeeCars();
            ec.setEmployeeId(employeeId);
            ec.setCarId(carId);
        }
        employeeCarsRepository.saveAll(employeeCars);
    }
}