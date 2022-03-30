package com.cenfotec.lab5.lab5.controller;

import com.cenfotec.lab5.lab5.domain.Journal;
import com.cenfotec.lab5.lab5.domain.Persona;
import com.cenfotec.lab5.lab5.service.JournalService;
import com.cenfotec.lab5.lab5.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.Instant;
import java.util.Date;

@Controller
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @RequestMapping("/templatePersona")
    public String index(Model model){
        model.addAttribute("persona", personaService.getAll());
        return "templatePersona";
    }

    @RequestMapping(value = "/templatePersona", method = RequestMethod.GET)
    public String navegarPaginaInsertar(Model model){
        model.addAttribute(new Persona());
        return "templatePersona";
    }

    @RequestMapping(value = "/templatePersona", method = RequestMethod.POST)
    public String accionInsertar(Persona persona, BindingResult result, Model model){
        personaService.savePersona(persona);
        return "index";
    }


}
