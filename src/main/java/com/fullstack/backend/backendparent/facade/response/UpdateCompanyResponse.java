
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: UpdateCompanyResponse.java, v 0.1 2021-07-12 20.06 firzagustama Exp $$
 */
public class UpdateCompanyResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 1133813460502902272L;

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