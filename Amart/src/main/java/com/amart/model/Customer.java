package com.amart.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "cust_name", length = 255)
    private String custName;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "cont_no", length = 20)
    private String contNo;

    @Column(name = "email", length = 255)
    private String email;

    // Getters and Setters
    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
