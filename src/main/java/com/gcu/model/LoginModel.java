package com.gcu.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginModel {
	
	@NotNull(message="Password is a required feild")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
	@NotNull(message="User name is a required feild")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String user) {
		username = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String pass) {
		password = pass;
	}

}
