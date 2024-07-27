package com.example.demo.Entity;

import java.sql.Date;
import java.util.UUID;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Media {
 @Id
 @GeneratedValue(strategy = GenerationType.UUID)
 private UUID media_id;
 private Enum media_type;
 private String media_url;
 private Integer media_size;
 private Date created_at;
 
// @OneToMany
// private Message mesage;
	
	
}
