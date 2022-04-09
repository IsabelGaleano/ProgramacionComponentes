package com.cenfotec.examen.repository;

import com.cenfotec.examen.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    public List<Persona> findAllByIdCliente(Long id);
}
