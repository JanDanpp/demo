package com.missz.xyframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.missz.xyshop.controller","com.missz.xyadmin.controller"})
public class XyFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(XyFrameworkApplication.class, args);
    }

}
