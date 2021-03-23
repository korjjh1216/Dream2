package com.example.demo.uss.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
public class UserDto {
    private static final long serialVersionUID = 1L;
	private String user_no;
	private String password;
	private String username;
	private String authority;
	private String email;
	private String birthday;
	private String gender;
}
