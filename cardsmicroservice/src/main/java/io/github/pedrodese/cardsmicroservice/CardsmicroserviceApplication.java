package io.github.pedrodese.cardsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardsmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsmicroserviceApplication.class, args);
		System.out.println("Cards microservice started!");
	}

}
