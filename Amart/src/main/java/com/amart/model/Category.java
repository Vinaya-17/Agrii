package com.amart.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "cat_id")
    private Integer catId;

    @Column(name = "cat_name", length = 255)
    private String catName;

    // Getters and Setters
    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}

