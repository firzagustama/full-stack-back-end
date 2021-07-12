
package com.fullstack.backend.backendparent.repository;

import com.fullstack.backend.backendparent.model.Car;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: CarRepository.java, v 0.1 2021-07-10 21.11 firzagustama Exp $$
 */
public interface CarRepository extends CrudRepository<Car, Integer> {

    List<Car> findAll(Pageable pageable);

}
