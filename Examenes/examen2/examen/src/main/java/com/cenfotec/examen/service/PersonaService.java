package com.cenfotec.examen.service;

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
    public Optional<Persona> findById(String id) {
        return personaRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }
}
