package com.example.jpa.pinholuc;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.pinholuc.entity.User;
import com.example.jpa.pinholuc.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Pedro","Admin");
		userRepository.save(user);
		
		Optional<User> findById = userRepository.findById(1L);
		List<User> usuariosRegistrados = userRepository.findAll();		
		long contagem = userRepository.count();
		
		log.info("New user is created: " + user);
		log.info("Usuário encontrado com método userRepository.findById: " + findById);
		log.info("Lista de usuários registrados no H2: " + usuariosRegistrados);
		log.info("A quantidade de usuários registrados é: " + contagem);
		
	}
	
	

}
