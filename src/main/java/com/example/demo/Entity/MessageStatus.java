package com.example.demo.Entity;

import java.sql.Date;
import java.util.UUID;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity

public class MessageStatus {
  @Id
  @GeneratedValue
  private UUID messageStatus_Id;
  @OneToOne
	private Message message;
  @ManyToOne
  private User user;
  private Enum Status;
  private Date Status_Uddate;
  
  
} 
