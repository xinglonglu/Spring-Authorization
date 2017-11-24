package com.lxl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.lxl.authorization.interceptor.AuthorizationInterceptor;



public class MvcConfig extends WebMvcConfigurerAdapter{
    @Autowired
    private AuthorizationInterceptor authorizationInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationInterceptor);
    }
}
