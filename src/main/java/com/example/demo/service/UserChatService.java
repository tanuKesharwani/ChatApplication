package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Entity.UserChat;
import com.example.demo.Repo.UserChatRepo;

@Service
public class UserChatService {

	@Autowired
	private UserChatRepo userchatrepo;
	public UserChatService(UserChatRepo userChatRepo) {
		this.userchatrepo=userChatRepo;	
	}
	
	public UserChat addUser1(UserChat user) {
		userchatrepo.save(user);
		return user;
		
	}
	
	
	
    public List<UserChat> getUserWithUserID(UUID id)
    {
       return userchatrepo.findAllByUserChatId(id);
    
    }
	
    public List<UserChat> getUserWithUserID1(UUID id)
    {
       return userchatrepo.findByUser_UserId(id);
    
    }
//    
    
	
	
	
	
}
