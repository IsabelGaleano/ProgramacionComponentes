package com.cenfotec.examen.controller;

import com.cenfotec.examen.domain.Auditor;
import com.cenfotec.examen.service.AuditorService;
import com.cenfotec.examen.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

@Controller
public class AuditorController {
    @Autowired
    AuditorService auditorService;

    @RequestMapping("/listadoAuditores")
    public String index(Model model){
        model.addAttribute("auditor", auditorService.getAll());
        return "listadoAuditores";
    }

    @RequestMapping(value = "/registroAuditores", method = RequestMethod.GET)
    public String navegarPaginaInsertar(Model model){
        model.addAttribute(new Auditor());
        return "registroAuditores";
    }

    @RequestMapping(value = "/registroAuditores", method = RequestMethod.POST)
    public String accionInsertar(Auditor auditor, BindingResult result, Model model){
        auditorService.saveAuditor(auditor);
        return "index";
    }

    @RequestMapping(value = "/activar/{id}")
    public String activarDesactivar(Model model, @PathVariable int id){

        Optional<Auditor> auditorToEdit = auditorService.getById(id);
        if (auditorToEdit.isPresent()) {
            if (auditorToEdit.get().getEstado().equals("Activo")) {
                auditorToEdit.get().setEstado("Inactivo");
            } else {
                auditorToEdit.get().setEstado("Activo");
            }

            auditorService.updateAuditor(auditorToEdit.get());
            return "exito";

        } else  {
            return "error";
        }


    }

    @RequestMapping(value = "/editarAuditor/{id}")
    public String editar(Model model, @PathVariable int id){

        Optional<Auditor> auditorToEdit = auditorService.getById(id);
        if (auditorToEdit.isPresent()) {
            model.addAttribute("auditorToEdit", auditorToEdit);
            return "editarAuditor";

        } else {
            return "error";
        }

    }

    @RequestMapping(value = "/editarAuditor/{id}", method = RequestMethod.POST)
    public String actualizarAuditor(Auditor auditor, BindingResult result, Model model, @PathVariable int id){
        auditor.setFechaNacimiento(Date.from(Instant.now()));
        auditorService.updateAuditor(auditor);
        return "exito";

    }



}
