
package com.fullstack.backend.backendparent.factory.impl;

import com.fullstack.backend.backendparent.facade.request.CreateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateEmployeeRequest;
import com.fullstack.backend.backendparent.facade.response.EmployeeResponse;
import com.fullstack.backend.backendparent.factory.CompanyFactory;
import com.fullstack.backend.backendparent.factory.EmployeeFactory;
import com.fullstack.backend.backendparent.model.Employee;
import com.fullstack.backend.backendparent.util.DateUtil;
import com.fullstack.backend.backendparent.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: EmployeeFactoryImpl.java, v 0.1 2021-07-10 20.41 firzagustama Exp $$
 */
@Service
public class EmployeeFactoryImpl implements EmployeeFactory {

    @Autowired
    private CompanyFactory companyFactory;

    @Override
    public EmployeeResponse getEmployee(Employee employee) {
        // compose employee to employe response
        EmployeeResponse response = new EmployeeResponse();
        response.setId(employee.getId());
        response.setName(employee.getName());
        response.setBirthPlace(employee.getBirthPlace());
        response.setBod(StringUtil.fromDate(employee.getBod()));
        response.setGender(employee.getGender());
        response.setAddress(employee.getAddress());
        response.setPhoneNumber(employee.getPhoneNumber());
        response.setCompany(companyFactory.getCompanyResponse(employee.getCompanyId()));

        return response;
    }

    @Override
    public Employee getEmployee(CreateEmployeeRequest request) {
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setBirthPlace(request.getBirthPlace());
        employee.setBod(DateUtil.fromString(request.getBod()));
        employee.setGender(request.getGender());
        employee.setAddress(request.getAddress());
        employee.setPhoneNumber(request.getPhoneNumber());
        employee.setCompanyId(request.getCompanyId());
        return employee;
    }

    @Override
    public Employee getEmployee(UpdateEmployeeRequest request) {
        Employee employee = new Employee();
        employee.setId(request.getId());
        employee.setName(request.getName());
        employee.setBirthPlace(request.getBirthPlace());
        employee.setBod(DateUtil.fromString(request.getBod()));
        employee.setGender(request.getGender());
        employee.setAddress(request.getAddress());
        employee.setPhoneNumber(request.getPhoneNumber());
        employee.setCompanyId(request.getCompanyId());
        return employee;
    }

    @Override
    public List<EmployeeResponse> getEmployees(List<Employee> employees) {
        List<EmployeeResponse> employeeResponses = new ArrayList<>();
        for (Employee e : employees) {
            employeeResponses.add(getEmployee(e));
        }

        return employeeResponses;
    }
}