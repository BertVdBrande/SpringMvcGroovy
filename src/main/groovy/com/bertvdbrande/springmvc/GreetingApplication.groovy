package com.bertvdbrande.springmvc

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
class GreetingApplication {

	public static void main(String... args) {
		SpringApplication.run(GreetingApplication, args)
	}

}
