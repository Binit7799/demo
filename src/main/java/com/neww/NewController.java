package com.neww;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
public class NewController {
	
	
	@GetMapping("/") 
	Greet greet() {
		
		return new Greet("Hello World");
	}
		

}


