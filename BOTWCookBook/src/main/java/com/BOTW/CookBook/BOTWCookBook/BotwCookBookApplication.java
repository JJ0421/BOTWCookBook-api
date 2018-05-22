package com.BOTW.CookBook.BOTWCookBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.BOTW"})
public class BotwCookBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BotwCookBookApplication.class, args);
	}
}
