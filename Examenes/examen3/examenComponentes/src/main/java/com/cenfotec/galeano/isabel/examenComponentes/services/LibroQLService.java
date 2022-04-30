package com.cenfotec.galeano.isabel.examenComponentes.services;

import com.cenfotec.galeano.isabel.examenComponentes.entities.LibroQL;
import com.cenfotec.galeano.isabel.examenComponentes.repositories.LibroQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroQLService {
    @Autowired
    LibroQLRepository libroRepository;
    public List<LibroQL> getAllLibros(int count) {
        return
                this.libroRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
    public Optional<LibroQL> getLibro(int id) {
        return this.libroRepository.findById(id);
    }
    public LibroQL createLibro(String nombre, String autor,
                               String precio, String estado) {

        LibroQL libroQL = new LibroQL();
        libroQL.setNombre(nombre);
        libroQL.setAutor(autor);
        libroQL.setPrecio(precio);
        libroQL.setEstado(estado);
        return this.libroRepository.save(libroQL);
    }

    public void save(LibroQL libroEntity) {
        this.libroRepository.save(libroEntity);
    }
}
