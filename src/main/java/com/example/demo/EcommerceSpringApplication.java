package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;
//import io.github.cdimascio.dotenv.DotenvEntry;
 


@SpringBootApplication //enabling few spring boot features starting point 
public class EcommerceSpringApplication {

	public static void main(String[] args) {

	Dotenv dotenv=Dotenv.configure().load();
	dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
    System.out.println("server.port: " + dotenv.get("SERVER_PORT"));
	SpringApplication.run(EcommerceSpringApplication.class, args);

		//kkkk
	} 

}

//./gradlew clean build --refresh-dependencies


/*
 *  System.setProperty() only affects your running Java process — not your terminal or OS environment.
That means:

dotenv.entries().forEach(...) sets system properties inside your Spring Boot app,

But it does not export environment variables to your terminal or other processes.cl
 */