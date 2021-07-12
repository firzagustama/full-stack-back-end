
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: CreateCompanyResponse.java, v 0.1 2021-07-12 20.04 firzagustama Exp $$
 */
public class CreateCompanyResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = -1731087634484200579L;

    /** company */
    private CompanyResponse company;

    /**
     * Getter method for property company.
     *
     * @return property value of company
     */
    public CompanyResponse getCompany() {
        return company;
    }

    /**
     * Setter method for property company.
     *
     * @param company value to be assigned to property company
     */
    public void setCompany(CompanyResponse company) {
        this.company = company;
    }
}