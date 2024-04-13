package com.example.interceptor;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception
    {
        ServletContext context = request.getServletContext();
        String sessionId = request.getSession().getId();
        long now = System.currentTimeMillis();
        Long lastTime = (Long) context.getAttribute(sessionId);
        if (lastTime == null)
        {
            context.setAttribute(sessionId, now);
            return true;
        }
        else if (now - lastTime > 1000)
        {
            context.setAttribute(sessionId, now);
            return true;
        }
        else
        {
            System.out.println(" 请求频率过高，拒绝访问 ");
            return false;
        }
    }


}
