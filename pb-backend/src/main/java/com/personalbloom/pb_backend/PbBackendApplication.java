package com.personalbloom.pb_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class PbBackendApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		String dbUsername = dotenv.get("DB_USERNAME");
		String dbPassword = dotenv.get("DB_PASSWORD");

		System.setProperty("spring.datasource.username", dbUsername);
		System.setProperty("spring.datasource.password", dbPassword);
		SpringApplication.run(PbBackendApplication.class, args);
	}

}
