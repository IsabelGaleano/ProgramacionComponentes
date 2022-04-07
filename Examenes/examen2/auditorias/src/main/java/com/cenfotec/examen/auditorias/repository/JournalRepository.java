package com.cenfotec.examen.auditorias.repository;

import com.cenfotec.examen.auditorias.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {
}
