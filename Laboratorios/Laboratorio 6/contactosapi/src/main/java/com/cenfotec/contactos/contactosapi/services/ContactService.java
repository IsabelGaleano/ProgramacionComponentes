package com.cenfotec.contactos.contactosapi.services;

import com.cenfotec.contactos.contactosapi.domain.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    public List<Contact> getAll();
    public Optional<Contact> findById(long id);
    public  Optional<Contact> save(Contact contact);
    public  Optional<Contact> update(Contact contact);
    public boolean delete(Long id);
}
