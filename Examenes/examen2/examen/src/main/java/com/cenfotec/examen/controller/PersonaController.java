package com.cenfotec.examen.controller;

import com.cenfotec.examen.domain.Persona;
import com.cenfotec.examen.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @RequestMapping("/listadoPersonas")
    public String index(Model model) {
        model.addAttribute("persona", personaService.getAll());
        return "listadoPersonas";
    }
    @GetMapping(path = {"/listadoPersonas/{idCliente}"})
    public String findById(@PathVariable String idCliente){
        Optional<Persona> result = personaService.findById(idCliente);
        if (result.isPresent()){
            return "listadoPersonas" + "/" + idCliente;
        }
        return " ";
    }
    @RequestMapping(value = "/registroPersonas", method = RequestMethod.GET)
    public String navegarPaginaInsertar(Model model) {
        model.addAttribute(new Persona());
        return "registroPersonas";
    }

    @RequestMapping(value = "/registroPersonas", method = RequestMethod.POST)
    public String accionInsertar(Persona persona, BindingResult result, Model model) {
        personaService.savePersona(persona);
        return "listadoPersonas";
    }
}
