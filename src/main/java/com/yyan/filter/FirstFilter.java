package com.yyan.filter;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.*;
import java.io.IOException;

@WebFilter(filterName = "FirstFilter", urlPatterns = "/first/servlet")
public class FirstFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入 filter ");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开 filter ");
    }
}
