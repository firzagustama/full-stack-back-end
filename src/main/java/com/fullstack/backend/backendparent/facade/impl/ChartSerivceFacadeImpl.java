
package com.fullstack.backend.backendparent.facade.impl;

import com.fullstack.backend.backendparent.facade.ChartServiceFacade;
import com.fullstack.backend.backendparent.facade.request.ChartRequest;
import com.fullstack.backend.backendparent.facade.response.ChartResponse;
import com.fullstack.backend.backendparent.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author firzagustama
 * @version $Id: ChartSerivceFacadeImpl.java, v 0.1 2021-07-13 00.53 firzagustama Exp $$
 */
@Service
public class ChartSerivceFacadeImpl implements ChartServiceFacade {

    /**
     * chartService
     */
    @Autowired
    private ChartService chartService;

    @Override
    public ChartResponse getChart(ChartRequest request) {
        return chartService.getChart(request);
    }
}