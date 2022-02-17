package com.chronicle.B;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
        @PropertySource("classpath:application.properties")
})
public class ApplicationB {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationB.class, args);
    }

}