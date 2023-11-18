package com.example.one.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.one.entity.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {

}
