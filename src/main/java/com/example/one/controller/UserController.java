package com.example.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.one.entity.Users;
import com.example.one.impservice.UserImpService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserImpService userImpService;

	@GetMapping("/")
	@ResponseBody
	public String homeGet() {
		return "Welcome to home";
	}
	
	@GetMapping("/add-user")
	@ResponseBody
	public List<Users> addUserGet() {
		return userImpService.getUser();
	}
	
	@PostMapping("/add-user")
	@ResponseBody
	public Users addUserPost(@RequestBody Users user) {
		userImpService.addUser(user);
		return user;
	}
}
