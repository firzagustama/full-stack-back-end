
package com.fullstack.backend.backendparent.filter;

import com.fullstack.backend.backendparent.service.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author firzagustama
 * @version $Id: FilterConfig.java, v 0.1 2021-07-11 21.19 firzagustama Exp $$
 */
@Configuration
public class FilterConfig {

    @Autowired
    private UserSessionService userSessionService;

    @Bean
    public FilterRegistrationBean<SessionCommonFilter> sessionFilter() {
        FilterRegistrationBean<SessionCommonFilter> registrationBean = new FilterRegistrationBean<>();

        SessionCommonFilter sessionCommonFilter = new SessionCommonFilter();
        sessionCommonFilter.setUserSessionService(userSessionService);

        registrationBean.setFilter(sessionCommonFilter);
        registrationBean.addUrlPatterns("/employee/*");
        registrationBean.addUrlPatterns("/company/*");
        registrationBean.addUrlPatterns("/car/*");
        registrationBean.addUrlPatterns("/user/logout");
        registrationBean.addUrlPatterns("/chart");

        return registrationBean;
    }
}