
package com.fullstack.backend.backendparent.service;

import com.fullstack.backend.backendparent.facade.request.CreateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.GetEmployeePaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.response.CreateEmployeeResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteEmployeeResponse;
import com.fullstack.backend.backendparent.facade.response.GetEmployeePaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateEmployeeResponse;

/**
 * @author firzagustama
 * @version $Id: EmployeeService.java, v 0.1 2021-07-10 20.34 firzagustama Exp $$
 */
public interface EmployeeService {

    GetEmployeePaginationResponse getEmployeePagination(GetEmployeePaginationRequest request);

    CreateEmployeeResponse createEmployee(CreateEmployeeRequest request);

    UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest request);

    DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request);

}
