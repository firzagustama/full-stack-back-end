
package com.fullstack.backend.backendparent.facade;

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
 * @version $Id: EmployeeServiceFacade.java, v 0.1 2021-07-10 20.29 firzagustama Exp $$
 */
public interface EmployeeServiceFacade {

    GetEmployeePaginationResponse getEmployeePagination(GetEmployeePaginationRequest request);

    CreateEmployeeResponse createEmployee(CreateEmployeeRequest request);

    UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest request);

    DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request);

}
