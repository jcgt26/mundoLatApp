package com.mundo_latino.product;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Product {
    @SequenceGenerator(
            name="package_seq",
            sequenceName = "package_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "package_seq"
    )
    @Id
    private Long id;
    @Column
    private Long customerId;
    @Column
    private Long externalId;
    @Column
    private Short status;
    @Column
    private Long locationId;
    @Column
    private Date createdAt;
    @Column
    private Date updatedAt;

    public Product(Long id, Long customerId, Long externalId, Short status, Long locationId) {
        this.id = id;
        this.customerId = customerId;
        this.externalId = externalId;
        this.status = status;
        this.locationId = locationId;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public Product() {

    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getExternalId() {
        return externalId;
    }

    public void setExternalId(long externalId) {
        this.externalId = externalId;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setExternalId(Long externalId) {
        this.externalId = externalId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}
