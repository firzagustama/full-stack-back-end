
package com.fullstack.backend.backendparent.factory;

import com.fullstack.backend.backendparent.facade.request.CreateCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCompanyRequest;
import com.fullstack.backend.backendparent.facade.response.CompanyResponse;
import com.fullstack.backend.backendparent.model.Company;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CompanyFactory.java, v 0.1 2021-07-10 21.35 firzagustama Exp $$
 */
public interface CompanyFactory {

    CompanyResponse getCompanyResponse(Integer companyId);

    CompanyResponse getCompanyResponse(Company company);

    List<CompanyResponse> getCompanyResponses(List<Company> companies);

    Company getCompany(CreateCompanyRequest request);

    Company getCompany(UpdateCompanyRequest request);

}
