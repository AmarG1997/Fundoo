package com.bridgelabz.test.dto;

public class RegisterDTO {
	
	private long id;
	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String mobileno;
	private String password;
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
