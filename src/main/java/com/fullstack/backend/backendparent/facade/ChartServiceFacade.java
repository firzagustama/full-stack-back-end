
package com.fullstack.backend.backendparent.facade;

import com.fullstack.backend.backendparent.facade.request.ChartRequest;
import com.fullstack.backend.backendparent.facade.response.ChartResponse;

/**
 * @author firzagustama
 * @version $Id: ChartServiceFacade.java, v 0.1 2021-07-13 00.52 firzagustama Exp $$
 */
public interface ChartServiceFacade {

    ChartResponse getChart(ChartRequest request);

}
