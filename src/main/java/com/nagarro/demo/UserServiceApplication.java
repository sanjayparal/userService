package com.nagarro.demo;

import com.nagarro.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/user/{id}")
	public ResponseEntity<User> getUser(){
		System.out.println("The id is 1");
		return ResponseEntity.ok(userRepository.findById(1).get());
	}

}
