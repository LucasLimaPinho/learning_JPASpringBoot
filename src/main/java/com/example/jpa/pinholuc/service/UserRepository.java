package com.example.jpa.pinholuc.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.pinholuc.entity.User;

/*

********************** Spring Data JPA ********************************************
*
*Permite a utiização de uma simples interface para lidar com os métodos de relação com o database
*para diversas entidades.
*
*Interface criada aqui: UserRepository
*
*
*Com Spring Data, você apenas cria as interfaces. Spring Data irá tomar conta de implementá-las.
*A interface irá conversar com o entityManager e realizar a transação que você deseja.
*Spring Data fornece uma abstração comum para evitar que tenhamos que escrever vários
*DAO services com lógicas semelhantes.	
	
*/

// JPARepository é uma interface presente no SPring Boot.
// Precisamos prover a entidade e o tipo da chave primária - Long no caso

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
