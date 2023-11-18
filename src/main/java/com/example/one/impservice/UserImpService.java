package com.example.one.impservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.one.entity.Users;
import com.example.one.repo.UserRepo;
import com.example.one.services.UserService;

@Service
public class UserImpService implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
		
	}

	@Override
	public List<Users> getUser() {
		// TODO Auto-generated method stub
		List<Users> users = userRepo.findAll();
		return users;
	}

}
