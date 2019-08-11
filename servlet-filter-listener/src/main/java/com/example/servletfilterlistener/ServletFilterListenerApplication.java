package com.example.servletfilterlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletFilterListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletFilterListenerApplication.class, args);
    }

}
