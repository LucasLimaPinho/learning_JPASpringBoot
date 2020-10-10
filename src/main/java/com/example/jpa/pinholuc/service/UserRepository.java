package com.example.jpa.pinholuc.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.pinholuc.entity.User;

/*

********************** Spring Data JPA ********************************************
*
*Permite a utiização de uma simples interface para lidar com os métodos de relação com o database
*para diversas entidades.
*
*Interface criada aqui: 	
	
	
	
*/

// JPARepository é uma interface presente no SPring Boot.
// Precisamos prover a entidade e o tipo da chave primária - Long no caso

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
