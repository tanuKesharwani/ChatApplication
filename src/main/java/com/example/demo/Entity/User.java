package com.example.demo.Entity;

import java.sql.Blob;
import java.sql.Time;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
 private UUID  userId;
 private String username;
 private Long phoneNumber;
 private String email;
 private String password;

 private  Blob profilePicture;
 private String status;
 private String last_seen;
 private Time created_At;
 private Time updated_At;
 
 
 
 
// 	@OneToMany
// 	private List<MessageStatus> messageStatus;
// 	@OneToOne
// 	private Setting setting;
// 	@OneToOne
// 	private Contacts contact;
 	
 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
 private List<UserChat> userChats;
}
