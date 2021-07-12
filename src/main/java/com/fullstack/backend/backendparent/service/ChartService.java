
package com.fullstack.backend.backendparent.service;

import com.fullstack.backend.backendparent.facade.request.ChartRequest;
import com.fullstack.backend.backendparent.facade.response.ChartResponse;

/**
 * @author firzagustama
 * @version $Id: ChartService.java, v 0.1 2021-07-13 00.54 firzagustama Exp $$
 */
public interface ChartService {

    ChartResponse getChart(ChartRequest request);

}
