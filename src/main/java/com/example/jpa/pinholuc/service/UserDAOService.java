package com.example.jpa.pinholuc.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.jpa.pinholuc.entity.User;


// @Repository ajuda a armazenar um bean em um database.


@Repository
@Transactional
public class UserDAOService {
	
	// EntityManager é uma interface para o PersistenceContext.
	// Quando uso entityManager.persist(user) estou dizendo agora que este user está sendo
	// gerenciado pelo framework de persistência.O user começa a ser trackeado pelo PersistenceContext
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	User lucas = new User("Lucas","Admin");
	User camila = new User("Camila", "Admin");
	
	public long insert(User user) {
		
		//Open Transaction
		entityManager.persist(user);
		//Close Transaction
		return user.getId();
	}
	
	/*
	
	********************** Spring Data JPA ********************************************
	*
	*Permite a utiização de uma simples interface para lidar com os métodos de relação com o database
	*para diversas entidades.
	*
	*Interface criada aqui: 	
		
		
		
	*/}
