package com.cenfotec.galeano.isabel.examenComponentes.controller;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Hijo;
import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;
import com.cenfotec.galeano.isabel.examenComponentes.services.HijoService;
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

    @Autowired
    private HijoService hijoService;

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


    @GetMapping(value = {"/{nombre}"})
    public ResponseEntity<Padre> findByNombreApellidos(@PathVariable("nombre") String nombre){
        Optional<Padre> result = padreService.findByNombreApellidos(nombre,nombre, nombre);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(path = {"/findPadreById/{idPadre}"})
    public ResponseEntity<Padre> findByNombreApellidos(@PathVariable long idPadre){
        List<Hijo> hijos = hijoService.findAllByPadre(idPadre);
        Optional<Padre> result = padreService.findById(idPadre);
        if (result.isPresent()){
            result.get().setHijos(hijos);
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
