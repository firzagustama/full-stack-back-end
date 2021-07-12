
package com.fullstack.backend.backendparent.factory;

import com.fullstack.backend.backendparent.facade.response.ChartResponse;
import com.fullstack.backend.backendparent.model.Chart;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: ChartFactory.java, v 0.1 2021-07-13 01.09 firzagustama Exp $$
 */
public interface ChartFactory {

    ChartResponse getChartResponse(List<Chart> charts);

}
