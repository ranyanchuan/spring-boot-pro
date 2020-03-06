package com.yyan.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * springboot 通过调用方法实现 filter
 */

public class SecondFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入 secondFilter ");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开 secondFilter ");
    }
}
