package com.mundo_latino.location;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Location {
    @SequenceGenerator(
            name="location_seq",
            sequenceName = "location_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "location_seq"
    )

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Location(long id, String name) {
        this.id = id;
        this.name = name;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public Location() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
