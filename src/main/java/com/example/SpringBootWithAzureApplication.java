package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("azuredemo")
public class SpringBootWithAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithAzureApplication.class, args);
	}

	@GetMapping("/get")
	public String getHeader(){
		return "<h1>Hello World</h1>";
	}
}
