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
@RequestMapping({"/hijos"})
public class HijoController {

    @Autowired
    private HijoService hijoService;

    @Autowired
    private PadreService padreService;

    @GetMapping
    public List getAll(){
        return hijoService.getAll();
    }

    @PostMapping
    public Hijo create(@RequestBody Hijo hijo){
        Optional<Padre> result = padreService.findById(hijo.getPadre().getId());
        hijo.setPadre(result.get());
        return hijoService.save(hijo).get();
    }

    @GetMapping(path = {"/{id}"})
    public List<Hijo> findAllByPadre(@PathVariable Long id){
       return hijoService.findAllByPadre(id);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Hijo> update(@PathVariable("id") long id,
                                        @RequestBody Hijo hijo){
        hijo.setId(id);
        Optional<Hijo> result = hijoService.update(hijo);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
