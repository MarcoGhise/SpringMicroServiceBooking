package it.blog.microservice.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class BookingServer {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "booking-server");
		SpringApplication.run(BookingServer.class, args);
	}
}
