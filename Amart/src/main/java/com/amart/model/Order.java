package com.amart.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "`order`") // Use backticks because 'order' is a reserved keyword
public class Order {

    @Id
    @Column(name = "ord_id")
    private Integer ordId;

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "prod_id")
    private Integer prodId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "status", length = 50)
    private String status;

    @ManyToOne
    @JoinColumn(name = "cust_id", referencedColumnName = "cust_id", insertable = false, updatable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "prod_id", referencedColumnName = "prod_id", insertable = false, updatable = false)
    private Product product;

    // Getters and Setters
    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

