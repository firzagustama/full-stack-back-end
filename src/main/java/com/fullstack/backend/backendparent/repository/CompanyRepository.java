
package com.fullstack.backend.backendparent.repository;

import com.fullstack.backend.backendparent.model.Company;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CompanyRepository.java, v 0.1 2021-07-10 21.11 firzagustama Exp $$
 */
public interface CompanyRepository extends CrudRepository<Company, Integer> {

    long count();

    List<Company> findAll(Pageable pageable);

}
