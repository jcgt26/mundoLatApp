package com.mundo_latino.model.contact;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Contact {
    @SequenceGenerator(
            name="contact_seq",
            sequenceName = "contact_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "contact_seq"
    )
    @Id
    private Long id;
    @Column
    private Long customerId;
    @Column
    private Long addressId;
    @Column
    private String phoneNumber;
    @Column
    private Date createdAt;
    @Column
    private Date updatedAt;

    public Contact(Long id, Long customerId, Long addressId, String phoneNumber) {
        this.id = id;
        this.customerId = customerId;
        this.addressId = addressId;
        this.phoneNumber = phoneNumber;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public Contact() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
