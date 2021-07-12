
package com.fullstack.backend.backendparent.service.impl;

import com.fullstack.backend.backendparent.enums.ErrorEnum;
import com.fullstack.backend.backendparent.facade.request.CreateCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.GetCompanyPaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCompanyRequest;
import com.fullstack.backend.backendparent.facade.response.CreateCompanyResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteCompanyResponse;
import com.fullstack.backend.backendparent.facade.response.GetCompanyPaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateCompanyResponse;
import com.fullstack.backend.backendparent.factory.CompanyFactory;
import com.fullstack.backend.backendparent.model.Company;
import com.fullstack.backend.backendparent.repository.CompanyRepository;
import com.fullstack.backend.backendparent.service.CompanyService;
import com.fullstack.backend.backendparent.util.ParamCheckHelper;
import com.fullstack.backend.backendparent.util.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CompanyServiceImpl.java, v 0.1 2021-07-10 22.32 firzagustama Exp $$
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyFactory companyFactory;

    @Override
    public GetCompanyPaginationResponse getCompanyPagination(GetCompanyPaginationRequest request) {
        GetCompanyPaginationResponse response = new GetCompanyPaginationResponse();

        // set pagination
        int page = request.getPage(), size = request.getSize();
        Pageable pageable = PageRequest.of(page, size);

        // query to repository
        long countAll = companyRepository.count();
        List<Company> companies = companyRepository.findAll(pageable);

        // compose response
        response.setHasMore(countAll > (long) (page + 1) * size);
        response.setCompanies(companyFactory.getCompanyResponses(companies));
        response.setSuccess(true);
        response.setCount(countAll);
        return response;
    }

    @Override
    public CreateCompanyResponse createCompany(CreateCompanyRequest request) {
        CreateCompanyResponse response = new CreateCompanyResponse();

        Company company = companyRepository.save(companyFactory.getCompany(request));

        // compose response
        response.setSuccess(true);
        response.setCompany(companyFactory.getCompanyResponse(company));
        return response;
    }

    @Override
    public UpdateCompanyResponse updateCompany(UpdateCompanyRequest request) {
        UpdateCompanyResponse response = new UpdateCompanyResponse();

        companyRepository.findById(request.getId())
                .orElseThrow(() -> new BaseException(ErrorEnum.UPDATE_DATA_NOT_EXISTS.getErrorCode()));
        Company company = companyRepository.save(companyFactory.getCompany(request));

        // compose result
        response.setSuccess(true);
        response.setCompany(companyFactory.getCompanyResponse(company));
        return response;
    }

    @Override
    public DeleteCompanyResponse deleteCompany(DeleteCompanyRequest request) {
        DeleteCompanyResponse response = new DeleteCompanyResponse();

        ParamCheckHelper.isNotNull(request.getId(), "id");

        companyRepository.deleteById(request.getId());

        // compose reslut
        response.setSuccess(true);
        response.setId(request.getId());
        return response;
    }
}