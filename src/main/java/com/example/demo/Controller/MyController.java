package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Entity.UserChat;
import com.example.demo.service.UserChatService;
import com.example.demo.service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController

public class MyController {

	
	
	
	@Autowired
	private UserService userservice;
	@Autowired
	private UserChatService userchatService;
	
	@PostMapping("/v1/add")
	public String postMethodName() {
		//TODO: process POST request
		
		return "I am coming";
	}
	
	
	@PostMapping("v1/addUser")
	public User adduser(@RequestBody User user) {
		userservice.addUser(user);
		return user;
	}
	
	


//	@GetMapping("alls")
//	public User getMethod2() {
//		return userservice.getUserWithUserID2();
	
	@GetMapping("all/{id}")
	public List<User> getMethod1(@PathVariable UUID id) {
		return userservice.getUserWithUserID(id);
	}
	
	

	@PostMapping("/v2/add")
public UserChat adduserchat(@RequestBody UserChat user) {
	return userchatService.addUser1(user);
}
	
	
//	
	@GetMapping("v2/alluserchats/{id}")
	public List<UserChat> getuserchat(@PathVariable UUID id) {
		return userchatService.getUserWithUserID1(id);
	}
	
	@GetMapping("v2/alluserchat/{id}")
	public List<UserChat> getuserchat1(@PathVariable UUID id) {
		return userchatService.getUserWithUserID(id);
	}
//	
	
	
	

	
}
