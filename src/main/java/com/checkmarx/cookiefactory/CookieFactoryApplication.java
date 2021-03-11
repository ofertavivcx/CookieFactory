package com.checkmarx.cookiefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CookieFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookieFactoryApplication.class, args);
	}

}
