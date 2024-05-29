package com.example.Whatsappapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;






@SpringBootApplication
@ComponentScan(basePackages = { "com.example.Whatsappapplication" })
@EnableAutoConfiguration
public class WhatsappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsappApplication.class, args);
	}

	
	
	
	

}
