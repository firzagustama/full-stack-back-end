
package com.fullstack.backend.backendparent.repository;

import com.fullstack.backend.backendparent.model.Chart;
import com.fullstack.backend.backendparent.model.EmployeeCars;
import com.fullstack.backend.backendparent.model.EmployeeCarsId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: EmployeeCarsRepository.java, v 0.1 2021-07-10 21.14 firzagustama Exp $$
 */
public interface EmployeeCarsRepository extends CrudRepository<EmployeeCars, EmployeeCarsId> {

    @Query(
            value = "SELECT e.name AS label, COUNT(ec.car_id) AS data FROM employee e INNER JOIN employee_cars ec ON ec.employee_id = e.id GROUP BY e.name",
            nativeQuery = true)
    List<Chart> getNumberOfCarsGroupByEmployee();

    @Query(
            value = "SELECT c.brand AS label, COUNT(ec.car_id) AS data FROM car c INNER JOIN employee_cars ec ON ec.car_id = c.id GROUP BY c.brand",
            nativeQuery = true)
    List<Chart> getNumberOfCarUsed();
}
