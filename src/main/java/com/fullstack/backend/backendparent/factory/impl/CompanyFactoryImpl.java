
package com.fullstack.backend.backendparent.factory.impl;

import com.fullstack.backend.backendparent.facade.request.CreateCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCompanyRequest;
import com.fullstack.backend.backendparent.facade.response.CompanyResponse;
import com.fullstack.backend.backendparent.factory.CompanyFactory;
import com.fullstack.backend.backendparent.model.Company;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CompanyFactoryImpl.java, v 0.1 2021-07-10 21.40 firzagustama Exp $$
 */
@Service
public class CompanyFactoryImpl implements CompanyFactory {

    @Override
    public CompanyResponse getCompanyResponse(Integer companyId) {
        if (companyId == null) {
            return null;
        }
        CompanyResponse companyResponse = new CompanyResponse();
        companyResponse.setId(companyId);
        return companyResponse;
    }

    @Override
    public CompanyResponse getCompanyResponse(Company company) {
        CompanyResponse response = new CompanyResponse();

        // return if null
        if (company == null) {
            return response;
        }

        // compose
        response.setId(company.getId());
        response.setName(company.getName());
        response.setAddress(company.getAddress());
        response.setPhoneNumber(company.getPhoneNumber());
        return response;
    }

    @Override
    public List<CompanyResponse> getCompanyResponses(List<Company> companies) {
        List<CompanyResponse> companyResponses = new ArrayList<>();
        for (Company company : companies) {
            companyResponses.add(getCompanyResponse(company));
        }

        return companyResponses;
    }

    @Override
    public Company getCompany(CreateCompanyRequest request) {
        Company company = new Company();
        company.setName(request.getName());
        company.setAddress(request.getAddress());
        company.setPhoneNumber(request.getPhoneNumber());
        return company;
    }

    @Override
    public Company getCompany(UpdateCompanyRequest request) {
        Company company = new Company();
        company.setId(request.getId());
        company.setName(request.getName());
        company.setAddress(request.getAddress());
        company.setPhoneNumber(request.getPhoneNumber());
        return company;
    }
}