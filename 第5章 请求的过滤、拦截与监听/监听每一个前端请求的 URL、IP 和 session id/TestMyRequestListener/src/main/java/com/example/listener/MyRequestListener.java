package com.example.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class MyRequestListener implements ServletRequestListener {
    public void requestInitialized(ServletRequestEvent sre)
    {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        String ip = request.getRemoteAddr();// 获取请求的 IP
        String url = request.getRequestURL().toString();// 获取请求访问的地址
        String sessionID = request.getSession().getId();// 获取 session id
        System.out.println(" 前端请求的 IP 地址为：" + ip);
        System.out.println(" 前端请求的 URL 地址为：" + url);
        System.out.println(" 前端请求的 session id 为：" + sessionID);

    }
    public void requestDestroyed(ServletRequestEvent sre)
    {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        String sessionID = request.getSession().getId();
        System.out.println("session id 为 " + sessionID + " 的请求已销毁 ");
    }


}
