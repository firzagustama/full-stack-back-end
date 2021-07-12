
package com.fullstack.backend.backendparent.facade.impl;

import com.fullstack.backend.backendparent.facade.EmployeeServiceFacade;
import com.fullstack.backend.backendparent.facade.request.CreateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.GetEmployeePaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.response.CreateEmployeeResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteEmployeeResponse;
import com.fullstack.backend.backendparent.facade.response.GetEmployeePaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateEmployeeResponse;
import com.fullstack.backend.backendparent.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author firzagustama
 * @version $Id: EmployeeServiceFacadeImpl.java, v 0.1 2021-07-10 20.34 firzagustama Exp $$
 */
@Service
public class EmployeeServiceFacadeImpl implements EmployeeServiceFacade {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public GetEmployeePaginationResponse getEmployeePagination(GetEmployeePaginationRequest request) {
        return employeeService.getEmployeePagination(request);
    }

    @Override
    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest request) {
        return employeeService.createEmployee(request);
    }

    @Override
    public UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest request) {
        return employeeService.updateEmployee(request);
    }

    @Override
    public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request) {
        return employeeService.deleteEmployee(request);
    }
}