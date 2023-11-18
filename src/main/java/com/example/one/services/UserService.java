package com.example.one.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.one.entity.Users;
import com.example.one.repo.UserRepo;

import lombok.AllArgsConstructor;

public interface UserService {
	
	void addUser(Users user);
	
	List<Users> getUser();
	
	
	

}
