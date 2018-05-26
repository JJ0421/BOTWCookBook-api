package com.BOTW.CookBook.BOTWCookBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.BOTW"})
@EntityScan("com.BOTW")
@EnableJpaRepositories("com.BOTW") 
public class BotwCookBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BotwCookBookApplication.class, args);
	}
}
