package com.example.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class ThirdFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入过滤器3");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
