
package com.fullstack.backend.backendparent.repository;

import com.fullstack.backend.backendparent.model.Chart;
import com.fullstack.backend.backendparent.model.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: EmployeeRepository.java, v 0.1 2021-07-10 20.18 firzagustama Exp $$
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    long count();

    List<Employee> findAll(Pageable pageable);

    @Query(
            value = "SELECT gender AS label, COUNT(gender) AS data FROM employee GROUP BY gender",
            nativeQuery = true)
    List<Chart> groupByGender();

    @Query(
            value = "SELECT e.name AS label, COALESCE(SUM(c.price),0) AS data " +
                    "FROM employee e " +
                    "LEFT JOIN employee_cars ec ON ec.employee_id = e.id " +
                    "LEFT JOIN car c ON c.id = ec.car_id " +
                    "GROUP BY e.name",
            nativeQuery = true)
    List<Chart> totalAssets();

    @Query(
            value = "SELECT IFNULL(c.name, 'Unemployment') AS label, COUNT(e.id) AS data FROM company c RIGHT JOIN employee e ON e.company_id = c.id GROUP BY c.name",
            nativeQuery = true)
    List<Chart> groupByCompany();
}
