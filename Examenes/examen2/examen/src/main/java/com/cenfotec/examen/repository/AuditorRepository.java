package com.cenfotec.examen.repository;

import com.cenfotec.examen.domain.Auditor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditorRepository extends JpaRepository<Auditor, Long> {
}