package com.cenfotec.examen.repository;

import com.cenfotec.examen.domain.Auditor;
import com.cenfotec.examen.domain.Journal;
import com.cenfotec.examen.domain.VisitaTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitaTrabajoRepository extends JpaRepository<VisitaTrabajo, Long> {


}
