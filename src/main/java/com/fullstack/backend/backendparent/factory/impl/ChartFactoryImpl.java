
package com.fullstack.backend.backendparent.factory.impl;

import com.fullstack.backend.backendparent.facade.response.ChartResponse;
import com.fullstack.backend.backendparent.factory.ChartFactory;
import com.fullstack.backend.backendparent.model.Chart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author firzagustama
 * @version $Id: ChartFactoryImpl.java, v 0.1 2021-07-13 01.09 firzagustama Exp $$
 */
@Service
public class ChartFactoryImpl implements ChartFactory {
    @Override
    public ChartResponse getChartResponse(List<Chart> charts) {
        ChartResponse chartResponse = new ChartResponse();

        // compose chart list data
        List<String> label = new ArrayList<>();
        List<Long> data = new ArrayList<>();
        for (Chart chart : charts) {
            label.add(chart.getLabel());
            data.add(chart.getData());
        }

        // compose result
        chartResponse.setLabel(label);
        chartResponse.setData(data);
        return chartResponse;
    }
}