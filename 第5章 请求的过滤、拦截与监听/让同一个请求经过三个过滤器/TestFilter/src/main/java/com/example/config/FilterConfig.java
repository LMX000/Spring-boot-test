package com.example.config;

import com.example.filter.FirstFilter;
import com.example.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<FirstFilter> getFilter1()
    {
        FilterRegistrationBean<FirstFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new FirstFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(1);
        return bean;
    } @Bean
    public FilterRegistrationBean<SecondFilter> getFilter2()
    {
        FilterRegistrationBean<SecondFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new SecondFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(2);
        return bean;
    } @Bean
    public FilterRegistrationBean<SecondFilter> getFilter3()
    {
        FilterRegistrationBean<SecondFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new SecondFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(3);
        return bean;
    }
}

