package com.atech.model;

import java.util.Locale.Category;

import jakarta.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private int brandId;

    @Column(name = "brand_name", nullable = false, length = 20)
    private String brandName;

    @ManyToOne
    @JoinColumn(name = "category_id") // Foreign key
    private Category category;

    // Constructors
    public Brand() {}

    public Brand(String brandName, Category category) {
        this.brandName = brandName;
        this.category = category;
    }

    // Getters and Setters
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Category getCategory() {
        return category;
    }
    
    public void setCategory(Category category) {
    	this.category=category;
    }
    }

   