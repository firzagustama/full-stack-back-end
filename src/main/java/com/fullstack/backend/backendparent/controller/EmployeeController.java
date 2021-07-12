
package com.fullstack.backend.backendparent.controller;

import com.fullstack.backend.backendparent.facade.EmployeeServiceFacade;
import com.fullstack.backend.backendparent.facade.request.CreateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.GetEmployeePaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.response.CreateEmployeeResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteEmployeeResponse;
import com.fullstack.backend.backendparent.facade.response.GetEmployeePaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author firzagustama
 * @version $Id: EmployeeController.java, v 0.1 2021-07-10 20.55 firzagustama Exp $$
 */
@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceFacade employeeServiceFacade;

    @PostMapping(path = "/")
    @ResponseBody
    public GetEmployeePaginationResponse getEmployeePagination(@RequestBody GetEmployeePaginationRequest request) {
        return employeeServiceFacade.getEmployeePagination(request);
    }

    @PostMapping(path = "/create")
    @ResponseBody
    public CreateEmployeeResponse createEmployee(@RequestBody CreateEmployeeRequest request) {
        return employeeServiceFacade.createEmployee(request);
    }

    @PostMapping(path = "/update")
    @ResponseBody
    public UpdateEmployeeResponse updateEmployee(@RequestBody UpdateEmployeeRequest request) {
        return employeeServiceFacade.updateEmployee(request);
    }

    @PostMapping(path = "/delete")
    @ResponseBody
    public DeleteEmployeeResponse deleteEmployee(@RequestBody DeleteEmployeeRequest request) {
        return employeeServiceFacade.deleteEmployee(request);
    }
}