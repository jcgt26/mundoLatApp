package com.mundo_latino.address;

import jakarta.persistence.*;
import org.hibernate.boot.model.source.spi.IdentifierSource;

import java.util.Date;

@Entity
@Table
public class Address {
    @SequenceGenerator(
            name="address_seq",
            sequenceName = "address_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "address_seq"
    )
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private Integer postalCode;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
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
