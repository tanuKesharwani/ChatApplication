package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	public UserService(UserRepo repo) {
		this.repo=repo;
		// TODO Auto-generated constructor stub
	}
	
	public User addUser(User user) {
		repo.save(user);
		return user;
		
	}
	
	public User getUserWithUserID2()
    {
       return (User) repo.findAll();
    
    }
	
    public List<User> getUserWithUserID(UUID id)
    {
       return  repo.findByUserId(id);
    
    }
	
//	public void  deleteUser(UUID id) {
//		repo.deleteById(id);
//		
//	}
	
	
	
}
