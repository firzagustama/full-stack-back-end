
package com.fullstack.backend.backendparent.facade.impl;

import com.fullstack.backend.backendparent.facade.CompanyServiceFacade;
import com.fullstack.backend.backendparent.facade.request.CreateCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.GetCompanyPaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCompanyRequest;
import com.fullstack.backend.backendparent.facade.response.CreateCompanyResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteCompanyResponse;
import com.fullstack.backend.backendparent.facade.response.GetCompanyPaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateCompanyResponse;
import com.fullstack.backend.backendparent.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author firzagustama
 * @version $Id: CompanyServiceFacadeImpl.java, v 0.1 2021-07-10 22.20 firzagustama Exp $$
 */
@Service
public class CompanyServiceFacadeImpl implements CompanyServiceFacade {

    @Autowired
    private CompanyService companyService;

    @Override
    public GetCompanyPaginationResponse getCompanyPagination(GetCompanyPaginationRequest request) {
        return companyService.getCompanyPagination(request);
    }

    @Override
    public CreateCompanyResponse createCompany(CreateCompanyRequest request) {
        return companyService.createCompany(request);
    }

    @Override
    public UpdateCompanyResponse updateCompany(UpdateCompanyRequest request) {
        return companyService.updateCompany(request);
    }

    @Override
    public DeleteCompanyResponse deleteCompany(DeleteCompanyRequest request) {
        return companyService.deleteCompany(request);
    }
}