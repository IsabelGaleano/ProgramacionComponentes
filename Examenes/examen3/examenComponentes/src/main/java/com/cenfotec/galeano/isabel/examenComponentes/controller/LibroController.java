package com.cenfotec.galeano.isabel.examenComponentes.controller;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Hijo;
import com.cenfotec.galeano.isabel.examenComponentes.domain.Libro;
import com.cenfotec.galeano.isabel.examenComponentes.services.HijoService;
import com.cenfotec.galeano.isabel.examenComponentes.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/libros"})
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List getAll(){
        return libroService.getAll();
    }

    @PostMapping
    public Libro create(@RequestBody Libro libro){
        return libroService.save(libro).get();
    }
}
