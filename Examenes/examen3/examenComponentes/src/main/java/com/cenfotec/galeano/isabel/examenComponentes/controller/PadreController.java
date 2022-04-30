package com.cenfotec.galeano.isabel.examenComponentes.controller;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;
import com.cenfotec.galeano.isabel.examenComponentes.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/padres"})
public class PadreController {
    @Autowired
    private PadreService padreService;

    @GetMapping
    public List getAll(){
        return padreService.getAll();
    }

    @PostMapping
    public Padre create(@RequestBody Padre padre){
        return padreService.save(padre).get();
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Padre> update(@PathVariable("id") long id,
                                          @RequestBody Padre padre){
        padre.setId(id);
        Optional<Padre> result = padreService.update(padre);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(path = {"/{nombre}"})
    public ResponseEntity<Padre> findByNombreApellidos(@PathVariable String nombre){
        Optional<Padre> result = padreService.findByNombreApellidos(nombre,nombre, nombre);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
