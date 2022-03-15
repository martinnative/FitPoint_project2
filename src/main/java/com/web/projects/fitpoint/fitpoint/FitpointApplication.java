package com.web.projects.fitpoint.fitpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@WebComponentScan
public class FitpointApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitpointApplication.class, args);
    }

}
