
package com.fullstack.backend.backendparent.facade.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: GetEmployeePaginationResponse.java, v 0.1 2021-07-10 20.28 firzagustama Exp $$
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetEmployeePaginationResponse extends BasePaginationResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = -1673689077019605809L;

    /** employees */
    List<EmployeeResponse> employees;

    /**
     * Getter method for property employees.
     *
     * @return property value of employees
     */
    public List<EmployeeResponse> getEmployees() {
        return employees;
    }

    /**
     * Setter method for property employees.
     *
     * @param employees value to be assigned to property employees
     */
    public void setEmployees(List<EmployeeResponse> employees) {
        this.employees = employees;
    }
}