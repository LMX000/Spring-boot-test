package com.example.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.springframework.stereotype.Component;

@Component
public class CountListener implements HttpSessionListener {
    private Integer count = 0;
    public void sessionCreated(HttpSessionEvent se)
    {
        count++;
        se.getSession().getServletContext().setAttribute("count", count);

    }

    public void sessionDestroyed(HttpSessionEvent se)
    {
        count--;
        se.getSession().getServletContext().setAttribute("count", count);
    }



}
