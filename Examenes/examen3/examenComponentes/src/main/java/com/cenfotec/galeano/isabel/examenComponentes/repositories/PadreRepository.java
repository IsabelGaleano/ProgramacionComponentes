package com.cenfotec.galeano.isabel.examenComponentes.repositories;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PadreRepository extends JpaRepository<Padre, Long> {
    public Optional<Padre> findPadreByNombreContainsOrApellido1ContainsOrAndApellido2Contains(String nombre, String apellido1, String apellido2);

    
}
