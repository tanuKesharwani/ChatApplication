package com.example.demo.Repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;
import java.util.List;



@Repository
public interface UserRepo extends JpaRepository<User,UUID>{
	List<User> findByUserId(UUID user_id);
}
