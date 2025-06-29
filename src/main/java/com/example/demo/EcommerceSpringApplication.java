package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;
//import io.github.cdimascio.dotenv.DotenvEntry;
 


@SpringBootApplication //enabling few spring boot features starting point 
public class EcommerceSpringApplication {

	public static void main(String[] args) {

		Dotenv dotenv=Dotenv.configure().load();
	//	dotenv.entries().forEach(DotenvEntry entry -> System.setProperty(entry.getKey(),entry.getValue()));
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
		SpringApplication.run(EcommerceSpringApplication.class, args);

		//kkkk
	} 

}

//./gradlew clean build --refresh-dependencies