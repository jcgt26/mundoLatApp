package com.mundo_latino.user;

import jakarta.persistence.Entity;

@Entity
public class Customer extends User {
    public Customer(long id, String firstName, String lastName, String email, String password, Integer role) {
        super(id, firstName, lastName, email, password, role);
    }

    public Customer() {

    }

}
