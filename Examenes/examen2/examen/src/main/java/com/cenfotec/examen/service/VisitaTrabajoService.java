package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Auditor;
import com.cenfotec.examen.domain.VisitaTrabajo;
import com.cenfotec.examen.repository.AuditorRepository;
import com.cenfotec.examen.repository.VisitaTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitaTrabajoService {
    @Autowired
    VisitaTrabajoRepository visitaRepository;

    public void saveVisita(VisitaTrabajo visita){
        visitaRepository.save(visita);
    }
    public List<VisitaTrabajo> getAll(){
        return visitaRepository.findAll();
    }

    public Optional<VisitaTrabajo> getById(int id) {
        return visitaRepository.findById(Long.valueOf(id));
    }

    public void updateAuditor(VisitaTrabajo visita) {
        visitaRepository.save(visita);
    }
}
