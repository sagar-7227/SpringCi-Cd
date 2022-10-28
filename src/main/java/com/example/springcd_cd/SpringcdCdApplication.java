package com.example.springcd_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcdCdApplication {


	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Page !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcdCdApplication.class, args);
	}

}
