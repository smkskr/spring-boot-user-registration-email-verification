package com.example.userregistrationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userregistrationapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
     User findByConfirmationToken(String confirmationToken);
}
