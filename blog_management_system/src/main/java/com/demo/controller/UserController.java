package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.LoginDto;
import com.demo.entity.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="http://localhost:3000")

public class UserController {
	@Autowired
	UserService usrp;
	
	@PostMapping("/register")//http://localhost:8080/users/register
	public String save(@RequestBody User u) {
		return usrp.save(u);
		
	}
	
	//define user valid or not 
		@PostMapping("/login")//http://localhost:8080/user/login
		public ResponseEntity<?> login(@RequestBody LoginDto logindto) {
			User user = usrp.login(logindto.getUsername(),logindto.getPassword());
			
			if(user != null) {
				return ResponseEntity.ok(user);
			}else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
			}
			}
	
}
//
//{
//	 
//	  "username": "john_doe",
//	  "email": "john@example.com",
//	  "contactNo": 9876543210,
//	  "password": "securePassword123",
//	  "urole": "ADMIN"
//	}
