package com.yyan.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class GlobalConfigException {

    /**
     * 方法必须有返回值 必须为 SimpleMappingExceptionResolver
     *
     * @return
     */
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {

        SimpleMappingExceptionResolver sim = new SimpleMappingExceptionResolver();
        Properties mappings = new Properties();

        // todo
        mappings.put("java.lang.NullPointerException", "java.lang.NullPointerException");
        sim.setExceptionMappings(mappings);
        return sim;
    }
}

