package io.github.pedrodese.customersmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomersmicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersmicroservicesApplication.class, args);
		System.out.println("Customers service started!");
	}

}
