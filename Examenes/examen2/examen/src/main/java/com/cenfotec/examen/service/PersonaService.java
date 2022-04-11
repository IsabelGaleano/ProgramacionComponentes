package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Auditor;
import com.cenfotec.examen.domain.Persona;
import com.cenfotec.examen.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    public List<Persona> getByCliente(Long id) {
        return personaRepository.findAllByIdCliente(id);
    }

    public Optional<Persona> getById(int id) {
        return personaRepository.findById(Long.valueOf(id));
    }
    public void updatePersona(Persona persona) {
        personaRepository.save(persona);
    }


    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    public void deletePersona(int id) {
        personaRepository.deleteById(Long.valueOf(id));
    }
}
