package com.cenfotec.galeano.isabel.examenComponentes.controller;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Hijo;
import com.cenfotec.galeano.isabel.examenComponentes.domain.Libro;
import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;
import com.cenfotec.galeano.isabel.examenComponentes.domain.ReporteLibros;
import com.cenfotec.galeano.isabel.examenComponentes.services.HijoService;
import com.cenfotec.galeano.isabel.examenComponentes.services.LibroService;
import com.cenfotec.galeano.isabel.examenComponentes.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/hijos"})
public class HijoController {

    @Autowired
    private HijoService hijoService;

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List getAll() {
        return hijoService.getAll();
    }

    @PostMapping
    public Hijo create(@RequestBody Hijo hijo) {
        return hijoService.save(hijo).get();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Hijo> update(@PathVariable("id") long id,
                                       @RequestBody Hijo hijo) {
        hijo.setId(id);
        Optional<Hijo> result = hijoService.update(hijo);
        if (result.isPresent()) {
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(path = {"/findLibrosByIdHijo/{idHijo}"})
    public ResponseEntity<Hijo> findByNombreApellidos(@PathVariable long idHijo) {
        List<Libro> libros = libroService.findAllByHijo(idHijo);
        Optional<Hijo> result = hijoService.findById(idHijo);
        if (result.isPresent()) {
            result.get().setLibros(libros);
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(path = {"/reporteLibros"})
    public List getReporteLibros() {
        List<Hijo> hijos = hijoService.getAll();
        List<ReporteLibros> reporte = new ArrayList<ReporteLibros>();
        for (Hijo hijo : hijos) {
            List<Libro> libros = libroService.findAllByHijo(hijo.getId());
            reporte.add(new ReporteLibros(hijo.getNombre(), libros.size()));
        }

        return reporte;
    }
}
