package com.example.demo.Entity;

import java.security.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserChat {
 
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID userChatId;
	
	
	@ManyToOne(cascade = CascadeType.MERGE) // Only merge changes to the associated User
    @JoinColumn(name = "user_id")
    private User user;
	
	private Date last_Read_message;
	@Column(columnDefinition = "Timestamp")
	private Date joined_At;
	private Boolean isAdmin;
	
	
	
	
}
