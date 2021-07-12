
package com.fullstack.backend.backendparent.facade.response;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: GetCompanyPaginationResponse.java, v 0.1 2021-07-10 22.15 firzagustama Exp $$
 */
public class GetCompanyPaginationResponse extends BasePaginationResponse{
    /** serialVersionUID */
    private static final long serialVersionUID = 1473714151986783500L;

    /** companies */
    private List<CompanyResponse> companies;

    /**
     * Getter method for property companies.
     *
     * @return property value of companies
     */
    public List<CompanyResponse> getCompanies() {
        return companies;
    }

    /**
     * Setter method for property companies.
     *
     * @param companies value to be assigned to property companies
     */
    public void setCompanies(List<CompanyResponse> companies) {
        this.companies = companies;
    }
}