
package com.fullstack.backend.backendparent.facade;

import com.fullstack.backend.backendparent.facade.request.CreateCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.DeleteCompanyRequest;
import com.fullstack.backend.backendparent.facade.request.GetCompanyPaginationRequest;
import com.fullstack.backend.backendparent.facade.request.UpdateCompanyRequest;
import com.fullstack.backend.backendparent.facade.response.CreateCompanyResponse;
import com.fullstack.backend.backendparent.facade.response.DeleteCompanyResponse;
import com.fullstack.backend.backendparent.facade.response.GetCompanyPaginationResponse;
import com.fullstack.backend.backendparent.facade.response.UpdateCompanyResponse;
import org.hibernate.sql.Delete;
import org.hibernate.sql.Update;

/**
 * @author firzagustama
 * @version $Id: CompanyServiceFacade.java, v 0.1 2021-07-10 22.17 firzagustama Exp $$
 */
public interface CompanyServiceFacade {

    GetCompanyPaginationResponse getCompanyPagination(GetCompanyPaginationRequest request);

    CreateCompanyResponse createCompany(CreateCompanyRequest request);

    UpdateCompanyResponse updateCompany(UpdateCompanyRequest request);

    DeleteCompanyResponse deleteCompany(DeleteCompanyRequest request);

}
