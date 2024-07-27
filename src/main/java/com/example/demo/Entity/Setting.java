package com.example.demo.Entity;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table

public class Setting {

	@Id
	@GeneratedValue
	private UUID setting_Id;
	
	@OneToOne
	private User user;
	
	private String setting_Key;
	private String setting_val;
	private Date created_At;
	private Date updated_At;
	
	    
}
