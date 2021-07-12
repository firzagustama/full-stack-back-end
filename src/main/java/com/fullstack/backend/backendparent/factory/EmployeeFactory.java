
package com.fullstack.backend.backendparent.factory;

import com.fullstack.backend.backendparent.facade.request.CreateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.response.EmployeeResponse;
import com.fullstack.backend.backendparent.model.Employee;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: EmployeeFactory.java, v 0.1 2021-07-10 20.40 firzagustama Exp $$
 */
public interface EmployeeFactory {

    EmployeeResponse getEmployee(Employee employee);

    Employee getEmployee(CreateEmployeeRequest request);

    Employee getEmployee(UpdateEmployeeRequest request);

    List<EmployeeResponse> getEmployees(List<Employee> employees);

}
