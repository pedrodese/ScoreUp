package io.github.pedrodese.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudgatewayApplication.class, args);
		System.out.println("Gateway Started!");
	}

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder){
		//TODO: Add all the routes of the microservices in the gateway
		return builder
				.routes()
					.route(r -> r.path("/customers/**").uri("lb://customersmicroservice"))
				.build();
	}

}
