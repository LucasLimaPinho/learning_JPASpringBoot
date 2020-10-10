package com.example.jpa.pinholuc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * 
 * 
 * Hibernate is of the most popular ORM (Object Relation Mapping) frameworks.
 * Hibernate is one of the popular implementations of JPA (Java Persistent API)
 * Hibernate understands the mappings that we add between objects (beans) and tables.
 * It ensures that data is stored/retrieved from the database based on the mappings
 * 
 * 

	How do you define your entities?
	
	How do you map attributes?
	
	How do you map relationships between entities?
	
	Who manages the entities?

*/

@SpringBootApplication
public class PinholucApplication {

	public static void main(String[] args) {
		SpringApplication.run(PinholucApplication.class, args);
	}

}
