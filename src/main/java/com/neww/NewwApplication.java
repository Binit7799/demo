package com.neww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class NewwApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewwApplication.class, args);
	}

}

	
