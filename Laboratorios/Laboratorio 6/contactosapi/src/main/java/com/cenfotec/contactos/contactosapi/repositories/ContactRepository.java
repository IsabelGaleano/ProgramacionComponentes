package com.cenfotec.contactos.contactosapi.repositories;

import com.cenfotec.contactos.contactosapi.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
