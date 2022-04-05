package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.User;
import com.model.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/login")
	public String authenticateUser(@RequestBody User user){
		User check=service.findUser(user.getId());
		if(check!=null) {
			if(check.getPassword().equals(user.getPassword())) {
				return "User authenticated";
			}
			else
				return "Invalid User";
		}
		else
			return "Invalid User";
	}
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody User user) {
		service.addUser(user);
		return "User added successfully";
	}
}
