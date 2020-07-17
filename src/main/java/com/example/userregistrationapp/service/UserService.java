package com.example.userregistrationapp.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userregistrationapp.model.User;
import com.example.userregistrationapp.repository.UserRepository;

@Service
public class UserService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private UserRepository userRepository; 
	
	public User saveUser(User user) {
		//entityManager.persist(user);
		return userRepository.save(user);
		
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findByConfirmationToken(String confirmationToken) {
		return userRepository.findByConfirmationToken(confirmationToken);
	}
	
	
}
