
package com.fullstack.backend.backendparent.service.impl;

import com.fullstack.backend.backendparent.facade.request.ChartRequest;
import com.fullstack.backend.backendparent.facade.response.ChartResponse;
import com.fullstack.backend.backendparent.factory.ChartFactory;
import com.fullstack.backend.backendparent.model.Chart;
import com.fullstack.backend.backendparent.repository.EmployeeCarsRepository;
import com.fullstack.backend.backendparent.repository.EmployeeRepository;
import com.fullstack.backend.backendparent.service.ChartService;
import com.fullstack.backend.backendparent.util.ParamCheckHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: ChartServiceImpl.java, v 0.1 2021-07-13 00.54 firzagustama Exp $$
 */
@Service
public class ChartServiceImpl implements ChartService {

    /**
     * employeeRepository
     */
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * employeeCarsRepository
     */
    @Autowired
    private EmployeeCarsRepository employeeCarsRepository;

    /**
     * chartFactory
     */
    @Autowired
    private ChartFactory chartFactory;

    @Override
    public ChartResponse getChart(ChartRequest request) {
        // param check
        ParamCheckHelper.isNotNull(request.getOption(), "option");
        ParamCheckHelper.isExpected(request.getOption() >= 1 && request.getOption() <= 5, "option");

        // get chart data by option
        List<Chart> charts = new ArrayList<>();
        if (request.getOption() == 1) {
            charts = employeeRepository.groupByGender();
        } else if (request.getOption() == 2) {
            charts = employeeCarsRepository.getNumberOfCarsGroupByEmployee();
        } else if (request.getOption() == 3) {
            charts = employeeRepository.totalAssets();
        } else if (request.getOption() == 4) {
            charts = employeeRepository.groupByCompany();
        } else if (request.getOption() == 5) {
            charts = employeeCarsRepository.getNumberOfCarUsed();
        }

        // compose response
        ChartResponse response = chartFactory.getChartResponse(charts);
        response.setSuccess(true);
        return response;
    }
}