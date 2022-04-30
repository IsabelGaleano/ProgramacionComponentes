package com.cenfotec.galeano.isabel.examenComponentes.services;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;

import java.util.List;
import java.util.Optional;

public interface PadreService {
    public List<Padre> getAll();
    public Optional<Padre> findById(long id);
    public Optional<Padre> findByNombreApellidos(String nombre, String apellido1, String apellido2);
    public  Optional<Padre> save(Padre padre);
    public  Optional<Padre> update(Padre padre);
    public boolean delete(Long id);
}
