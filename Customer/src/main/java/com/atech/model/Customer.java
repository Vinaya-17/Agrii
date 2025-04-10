package com.atech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="CUSTOMER") 
@Table 
public class Customer { 
 @Id 
 @GeneratedValue(strategy=GenerationType.IDENTITY) 
 private int id; 
 @Column(unique = true) 
 private String username;  
 private String email;  
 private String password;  
 private int contact_no; 
 private String address; 
 public int getId() { 
  return id; 
 } 
 public void setId(int id) { 
  this.id = id; 
 } 
 public String getUsername() { 
  return username; 
 } 
 public void setUsername(String username) { 
  this.username=username;
 }
 public String getEmail() { 
	  return email; 
	 } 
	 public void setEmail(String email) { 
	  this.email = email; 
	 } 
	 public String getPassword() { 
	  return password; 
	 } 
	 public void setPassword(String password) { 
	  this.password = password; 
	 } 
	 public int getcontact_no() { 
	  return contact_no; 
	 } 
	 public void setcontact_no(int contact_no) { 
	  this.contact_no = contact_no; 
	 } 
	 public String getAddress() { 
	  return address; 
	 } 
	 public void setAddress(String address) { 
	  this.address=address;
	 }
}