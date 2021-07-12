
package com.fullstack.backend.backendparent.controller;

import com.fullstack.backend.backendparent.facade.CompanyServiceFacade;
import com.fullstack.backend.backendparent.facade.request.CreateCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.GetCompanyPaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCompanyRequest;
import com.fullstack.backend.backendparent.facade.response.CreateCompanyResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteCompanyResponse;
import com.fullstack.backend.backendparent.facade.response.GetCompanyPaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateCompanyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author firzagustama
 * @version $Id: CompanyController.java, v 0.1 2021-07-10 22.18 firzagustama Exp $$
 */
@Controller
@RequestMapping(path = "/company")
public class CompanyController {

    @Autowired
    private CompanyServiceFacade companyServiceFacade;

    @PostMapping(path = "/")
    @ResponseBody
    private GetCompanyPaginationResponse getCompanyPagination(@RequestBody GetCompanyPaginationRequest request) {
        return companyServiceFacade.getCompanyPagination(request);
    }

    @PostMapping(path = "/create")
    @ResponseBody
    private CreateCompanyResponse createCompany(@RequestBody CreateCompanyRequest request) {
        return companyServiceFacade.createCompany(request);
    }

    @PostMapping(path = "/update")
    @ResponseBody
    private UpdateCompanyResponse updateCompany(@RequestBody UpdateCompanyRequest request) {
        return companyServiceFacade.updateCompany(request);
    }

    @PostMapping(path = "/delete")
    @ResponseBody
    private DeleteCompanyResponse deleteCompany(@RequestBody DeleteCompanyRequest request) {
        return companyServiceFacade.deleteCompany(request);
    }
}