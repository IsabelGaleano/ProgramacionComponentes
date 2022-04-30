package com.cenfotec.galeano.isabel.examenComponentes.repositories;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Hijo;
import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HijoRepository extends JpaRepository<Hijo, Long> {
    public List<Hijo> findAllByPadreId(Long id);
}
