package com.ouath2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ouath2.entities.User;
import com.ouath2.repositories.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
    PasswordEncoder passwordEncoder;
	
	@PostMapping("/users")
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/users")
	public List<User> getAll(){
		return userRepository.findAll();
	}
}