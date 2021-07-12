
package com.fullstack.backend.backendparent.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author firzagustama
 * @version $Id: CorsConfiguration.java, v 0.1 2021-07-11 13.31 firzagustama Exp $$
 */
@Configuration
@EnableWebMvc
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedMethods("GET", "POST")
//                .allowCredentials(true)
                .allowedOrigins("http://localhost:8000")
                .exposedHeaders("session, Set-Cookie");
    }
}