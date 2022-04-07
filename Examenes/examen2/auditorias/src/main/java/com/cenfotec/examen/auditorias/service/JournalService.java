package com.cenfotec.examen.auditorias.service;

import com.cenfotec.examen.auditorias.domain.Journal;
import com.cenfotec.examen.auditorias.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class JournalService {
    @Autowired
    JournalRepository journalRepository;
    public void saveJournal(Journal journal){
        journalRepository.save(journal);
    }
    public List<Journal> getAll(){
        return journalRepository.findAll();
    }

    public Optional<Journal> getById(int id) {
        return journalRepository.findById(Long.valueOf(id));
    }

    public void updateJournal(Journal journal) {
        journalRepository.save(journal);
    }

    public void deleteJournal(int id) {
        journalRepository.deleteById(Long.valueOf(id));
    }
}
