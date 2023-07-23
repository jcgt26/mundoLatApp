package com.mundo_latino.model.address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Address {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private Integer postalCode;
    @Column
    private Date createdAt;
    @Column
    private Date updatedAt;

    public Address(Long id, String name, Integer postalCode) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public Address() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
