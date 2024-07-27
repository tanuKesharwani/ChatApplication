package com.example.demo.Entity;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity

@AllArgsConstructor
@NoArgsConstructor

public class Chat {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
  private UUID chat_id;
  private Enum chat_type;
  private Date created_At;
  private Date updated_At;
   
  @OneToMany
  private List<Message> message;
   
  
  
}
