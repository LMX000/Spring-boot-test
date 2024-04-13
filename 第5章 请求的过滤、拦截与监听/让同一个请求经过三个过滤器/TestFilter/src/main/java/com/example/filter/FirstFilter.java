package com.example.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入过滤器1");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
