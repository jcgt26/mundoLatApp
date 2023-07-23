package com.mundo_latino.model.user;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {
    public Admin(long id, String firstName, String lastName, String email) {
        super(id, firstName, lastName, email);
    }
    public Admin(){

    }
}
