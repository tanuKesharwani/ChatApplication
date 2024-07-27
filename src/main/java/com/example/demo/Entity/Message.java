package com.example.demo.Entity;

import java.sql.Blob;
import java.sql.Date;
import java.util.UUID;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID )
	private UUID message_Id;
	
	
	private UUID sender_Id;
	private String Test;
	private Blob mediaulr;
	private Enum message_type;
	private Date created_At;
	private Date updated_At;
	private Date Deleted_At;
	@ManyToOne
	private Media media;
@ManyToOne
	
	private Chat chat_id;

	
 	
}
