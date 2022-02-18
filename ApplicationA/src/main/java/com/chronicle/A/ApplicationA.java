package com.chronicle.A;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//@SpringBootApplication(exclude = {ServletWebServerFactoryAutoConfiguration.class,
//        WebMvcAutoConfiguration.class})
@SpringBootApplication
//@PropertySources({
//        @PropertySource("classpath:application.properties")
//})
public class ApplicationA {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationA.class, args);
    }
}
