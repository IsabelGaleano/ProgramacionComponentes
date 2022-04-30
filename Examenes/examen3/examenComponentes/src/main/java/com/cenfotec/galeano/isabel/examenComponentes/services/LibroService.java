package com.cenfotec.galeano.isabel.examenComponentes.services;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Hijo;
import com.cenfotec.galeano.isabel.examenComponentes.domain.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService {
    public List<Libro> getAll();
    public Optional<Libro> findById(long id);
    public  Optional<Libro> save(Libro libro);
    public List<Libro> findAllByHijo(long idHijo);

}
