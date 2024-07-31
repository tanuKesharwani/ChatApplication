package com.example.demo.Repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserChat;
@Repository
@EnableJpaRepositories
public interface UserChatRepo extends JpaRepository<UserChat, UUID>{
	
	List<UserChat> findAllByUserChatId(UUID userId);
//	List<UserChat> findAllByuserId(UUID userId);
	List<UserChat> findByUser_UserId(UUID userId);
}
