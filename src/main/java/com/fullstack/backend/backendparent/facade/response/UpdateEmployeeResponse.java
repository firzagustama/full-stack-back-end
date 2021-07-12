
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: UpdateEmployeeResponse.java, v 0.1 2021-07-12 19.15 firzagustama Exp $$
 */
public class UpdateEmployeeResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 8965352341311641892L;

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