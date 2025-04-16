package org.example.doandemo3_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DoAnDemo32Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DoAnDemo32Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DoAnDemo32Application.class, args);
    }
}
