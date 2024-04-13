package com.example.interceptor;

import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception
    {
        if (handler instanceof HandlerMethod)
        {
            HandlerMethod method = (HandlerMethod) handler;
            System.out.println("（1）请求访问的方法是：" + method.getMethod().getName() + "()");
            Object value = request.getAttribute("value");// 读取请求某个属性，默认为 null
            System.out.println(" 执行方法前：value=" + value);
            return true;
        }
    return false;
    }
    public void postHandle(HttpServletRequest request, HttpServletResponse response,Object handler,@Nullable ModelAndView modelAndView)throws Exception
    {
        Object value = request.getAttribute("value");// 执行完请求，再读取此属性
        System.out.println("（2）执行方法后：value=" + value);
    }
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable Exception ex)throws Exception
    {
        request.removeAttribute("value");
        System.out.println("（3）整个请求都执行完毕，在此做一些资源释放工作 ");
    }

}
