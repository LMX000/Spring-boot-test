package com.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
@WebFilter(urlPatterns = "/video/123456.mp4")
public class CountFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext context = filterConfig.getServletContext();// 获取上下文对象
        context.setAttribute("count", 0);// 计数器初始值为 0
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        ServletContext context = req.getServletContext();// 获取上下文对象
        Integer count = (Integer) context.getAttribute("count"); // 获取计数器的值
        context.setAttribute("count", ++count); // 让计数器自增
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
