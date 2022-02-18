package com.chronicle.A;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {ServletWebServerFactoryAutoConfiguration.class,
//        WebMvcAutoConfiguration.class})
@SpringBootApplication
//@PropertySources({
//        @PropertySource("classpath:application.properties")
//})
public class AApplication {
    public static void main(String[] args) {
        SpringApplication.run(AApplication.class, args);
    }
}
