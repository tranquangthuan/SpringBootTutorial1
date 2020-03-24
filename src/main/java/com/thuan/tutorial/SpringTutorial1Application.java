package com.thuan.tutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTutorial1Application extends SpringBootServletInitializer {

	@Value("${spring.application.name:test}")
	private String name;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringTutorial1Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorial1Application.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World from tomcat with name = " + name;
	}
}
