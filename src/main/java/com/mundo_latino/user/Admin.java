package com.mundo_latino.user;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {
    public Admin(long id, String firstName, String lastName, String email, String password, Integer role) {
        super(id, firstName, lastName, email, password, role);
    }
    public Admin(){

    }
}
