package com.example.jpa.pinholuc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// User é uma entity
// Quero fazer o map deste bean que é o User como uma Table em um relational database.
// Aí que entra o poder das anotações do JPA no Spring Boot Framework.

// @Entity já especifica que uma classe é uma entidade.
// Para ser capaz de usar salvar essas entidades em um database, precisamos de EntityManager ---> UserDAOService

@Entity
public class User {
	
	
	// @Id determina que long id é uma chave primária.
	// @GeneratedValue -> não precisamos setar o valor de Id, será gerado automaticamente.
	
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;
	
	//JPA expects a default constructor.
	
	protected User() {
		
	}	

	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	

}
