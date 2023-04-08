package com.example.EmployeesecurityJwt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	private String email;
	private String phonenumber;
	public User() {}
	public User(int id, String username, String password, String email, String phonenumber) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setName(String name) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	

}
