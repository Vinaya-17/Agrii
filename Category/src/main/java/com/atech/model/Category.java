package com.atech.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="category") 
	public class Category { 
	 @Id 
	
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "category_id") 
	 private int id; 
	 @Column(name = "category_name") 
	 private String name;  
	 public int getId() { 
	  return id; 
	 } 
	 public void setId(int id) { 
	  this.id = id; 
	 } 
	 public String getName() { 
	  return name; 
	 } 
	 public void setName(String name) {
		 this.name=name;
	 }
}

