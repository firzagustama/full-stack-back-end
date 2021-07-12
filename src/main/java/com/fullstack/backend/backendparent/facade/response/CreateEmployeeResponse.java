
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: CreateEmployeeResponse.java, v 0.1 2021-07-12 19.49 firzagustama Exp $$
 */
public class CreateEmployeeResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 6862491151799063928L;

    /** employee */
    private EmployeeResponse employee;

    /**
     * Getter method for property employee.
     *
     * @return property value of employee
     */
    public EmployeeResponse getEmployee() {
        return employee;
    }

    /**
     * Setter method for property employee.
     *
     * @param employee value to be assigned to property employee
     */
    public void setEmployee(EmployeeResponse employee) {
        this.employee = employee;
    }
}