package com.mundo_latino.model.contact;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService {
    public List<Contact> getContacts() {
        return List.of(
                new Contact(
                        2L,
                        2L,
                        3L,
                        "32323233232"

                )
        );
    }
}
