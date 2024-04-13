package com.example.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class SecondFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入过滤器2");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
