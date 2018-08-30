package com.capgemini.imdbGroup4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ImdbGroup4Application extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ImdbGroup4Application.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(ImdbGroup4Application.class, args);
	}
}
