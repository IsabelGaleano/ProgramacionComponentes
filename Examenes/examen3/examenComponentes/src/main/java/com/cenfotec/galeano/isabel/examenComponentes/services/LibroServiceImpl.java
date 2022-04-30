package com.cenfotec.galeano.isabel.examenComponentes.services;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Libro;
import com.cenfotec.galeano.isabel.examenComponentes.repositories.HijoRepository;
import com.cenfotec.galeano.isabel.examenComponentes.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService{

    @Autowired
    LibroRepository libroRepository;

    @Override
    public List<Libro> getAll() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> findById(long id) {
        return libroRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<Libro> save(Libro libro) {
        return Optional.of(libroRepository.save(libro));
    }

    @Override
    public List<Libro> findAllByHijo(long idHijo) {
        return libroRepository.findAllByIdHijo(idHijo);
    }

}
