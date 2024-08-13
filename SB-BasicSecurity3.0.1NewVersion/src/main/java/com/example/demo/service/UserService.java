package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService 
{
	@Autowired
	private UserRepo repo;
	
	public User addUser(User user)
	{
		return repo.save(user);
	}
	
	public List<User> allUser()
	{
		return repo.findAll();
	}
	
	public User findUserByName(String username)
	{
		return repo.findByUserName(username);
	}
}
