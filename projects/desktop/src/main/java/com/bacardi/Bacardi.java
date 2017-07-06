package com.bacardi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;




@ComponentScan({"com.bacardi.*"})
@SpringBootApplication
public class Bacardi extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Bacardi.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Bacardi.class, args);
	}
 }
