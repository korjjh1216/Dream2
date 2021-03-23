package com.example.demo.uss.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table( name = "User")
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_no")
	private long userNo;
	
	@Column(name = "username") 
	private String username;

	@Column(name = "password") 
	private String password;
	
		
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "regdate")
	private String regdate;
    
    
}
