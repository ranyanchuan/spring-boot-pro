package com.yyan;

import com.yyan.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


// springboot 启动类
@SpringBootApplication
@ServletComponentScan // 在springboot 启动是会扫描@WebServlet,并将该类示例
public class App {

    public static void main(String[] args) {
        // 执行启动器run 方法
        // 从当前包下进行扫描组件
        SpringApplication.run(App.class, args);

    }

    // 调用方法 注册 servlet
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second/servlet"); // 设置 url
        return bean;
    }
}
