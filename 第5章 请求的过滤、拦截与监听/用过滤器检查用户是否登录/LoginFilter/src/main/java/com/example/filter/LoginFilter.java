package com.example.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        Object user = req.getSession().getAttribute("user");
        if (user == null)
        {
            req.getRequestDispatcher("/login").forward(servletRequest, servletResponse);
        }
        else
        {
            filterChain.doFilter(servletRequest, servletResponse);
        }



        }
}
