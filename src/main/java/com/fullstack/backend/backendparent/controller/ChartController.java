
package com.fullstack.backend.backendparent.controller;

import com.fullstack.backend.backendparent.facade.ChartServiceFacade;
import com.fullstack.backend.backendparent.facade.request.ChartRequest;
import com.fullstack.backend.backendparent.facade.response.ChartResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author firzagustama
 * @version $Id: ChartController.java, v 0.1 2021-07-13 01.06 firzagustama Exp $$
 */
@Controller
@RequestMapping(path = "/chart")
public class ChartController {

    @Autowired
    private ChartServiceFacade chartServiceFacade;

    @PostMapping
    @ResponseBody
    private ChartResponse getChart(@RequestBody ChartRequest request) {
        return chartServiceFacade.getChart(request);
    }
}